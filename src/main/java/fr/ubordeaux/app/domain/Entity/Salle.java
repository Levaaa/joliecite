package fr.ubordeaux.app.domain.Entity;

import java.util.HashMap;
import fr.ubordeaux.app.domain.ValueObject.Date;
import fr.ubordeaux.app.domain.ValueObject.Horaire;
import fr.ubordeaux.app.domain.ValueObject.Capacite;
import fr.ubordeaux.app.domain.ValueObject.NomSalle;


public class Salle {
    
    private static int UNIQUE_ID = 0;
    private final int id = UNIQUE_ID++;

    private Capacite capacite;
    private Date ouverture;
    private Horaire horaire;
    private NomSalle nom;


    // Les salles sont d´efinies par une capacit´e, des horaires et date d’ouverture (1 seule par jour) et
    // une liste d’´ev`enements programm´es.
    HashMap<Date, Evenement> evenementHashMap = new HashMap<Date, Evenement>();


    public Salle(Capacite capacite, Date ouverture, Horaire horaire, NomSalle nom) {
        this.capacite = capacite;
        this.ouverture = ouverture;
        this.horaire = horaire;
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", capacite='" + capacite + "'" +
            ", ouverture='" + ouverture + "'" +
            ", horaire='" + horaire + "'" +
            ", nom='" + nom + "'" +
            ", evenementHashMap='" + evenementHashMap + "'" +
            "}";
    }

    public String toXML() {
        return   "<Salle>" + "\n" +
        nom.toXML()        + "\n" +
        ouverture.toXML()  + "\n" +
        horaire.toXML()    + "\n" +
        capacite.toXML()   + "\n" +
                 "</Salle>";
    }



}
