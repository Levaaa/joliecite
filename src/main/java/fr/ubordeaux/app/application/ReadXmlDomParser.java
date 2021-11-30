package fr.ubordeaux.app.application;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;

import fr.ubordeaux.app.domain.ValueObject.*;
import fr.ubordeaux.app.domain.Entity.*;

/**
 * from https://mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
 */
public class ReadXmlDomParser {

    private final String path = System.getProperty("user.dir") + "/ressources/";

    public ReadXmlDomParser() {


    }

    // <?xml version="1.0"?>
    // <init>
    //     <Evenement>
    //         <Concert>
    //             <artiste>Ultra Vomit</artiste>
    //         </Concert>
    //         <PieceTheatre>
    //             <nom>Antigone</nom>
    //             <intervalle>3</intervalle>
    //         </PieceTheatre>
    //     </Evenement>
    //     <salle>
    //         <nom>Arena</nom>
    //         <date>01/01/21</date>
    //         <horaire>19h00</horaire>
    //     </salle>
    // </init>


    public ArrayList<ArrayList> readInitFile(String filename) {

        // path complet avec le nom de fichier inclu
        String finalPath = path + filename;

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        ArrayList<Evenement> evenementsList = new ArrayList<Evenement>();
        ArrayList<Salle> sallesList = new ArrayList<Salle>();
  
        try {
  
            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
  
            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();
  
            Document doc = db.parse(new File(finalPath));
  
            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();
  
            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");
  
            // Recupère toutes les SALLES
            NodeList list = doc.getElementsByTagName("Salle");
  
            for (int temp = 0; temp < list.getLength(); temp++) {
  
                Node node = list.item(temp);
  
                if (node.getNodeType() == Node.ELEMENT_NODE) {
  
                    Element element = (Element) node;
                    String nom = element.getElementsByTagName("nom").item(0).getTextContent();
                    String date = element.getElementsByTagName("date").item(0).getTextContent();
                    String horaire = element.getElementsByTagName("horaire").item(0).getTextContent();
                    String capacite = element.getElementsByTagName("capacite").item(0).getTextContent();

                    String[] subDate = date.split("/");

                    String[] time = horaire.split("h");
                    

                    Salle salle = new Salle(new Capacite(Integer.parseInt(capacite)), new Date(Integer.parseInt(subDate[0]), Integer.parseInt(subDate[1]), Integer.parseInt(subDate[2])), new Horaire(Integer.parseInt(time[0]), Integer.parseInt(time[1])), new NomSalle(nom));
                    sallesList.add(salle);
                }
            }

            list = doc.getElementsByTagName("Evenement");
  
            for (int temp = 0; temp < list.getLength(); temp++) {
                
                list = doc.getElementsByTagName("Concert");
                
                for (int tmp = 0; tmp < list.getLength(); tmp++) {
  
                    Node node = list.item(tmp);
    
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
    
                        Element element = (Element) node;

                        String artiste = element.getElementsByTagName("artiste").item(0).getTextContent();

                        Evenement concert = new Concert(new Artiste(artiste));
                        evenementsList.add(concert);
                        
                    }
                }
                
                list = doc.getElementsByTagName("PieceTheatre");
                
                for (int tmp = 0; tmp < list.getLength(); tmp++) {
                    
                    Node node = list.item(tmp);
                    
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        
                        Element element = (Element) node;
                        
                        String nom = element.getElementsByTagName("nom").item(0).getTextContent();
                        String intervalle = element.getElementsByTagName("intervalle").item(0).getTextContent();
                        
                        Evenement pieceTheatre = new PieceTheatre(new Piece(nom), Integer.parseInt(intervalle));
                        evenementsList.add(pieceTheatre);

                    }
                }
            }
  
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        ArrayList<ArrayList> ret = new ArrayList<ArrayList>();
        ret.add(evenementsList);
        ret.add(sallesList);
        
        return ret;
  }

}