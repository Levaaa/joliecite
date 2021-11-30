package fr.ubordeaux.app;

import fr.ubordeaux.app.domain.Entity.*;
import fr.ubordeaux.app.domain.ValueObject.*;
import fr.ubordeaux.app.application.*;


import java.util.ArrayList;
import java.util.Iterator;

import fr.ubordeaux.app.domain.*;

// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.StackPane;
// import javafx.stage.Stage;

public class App {
    public static void main(String[] args) {
        // Evenement concert = new Concert(new Date(1, 1, 21), new Artiste("JUL"));
        // System.out.println(concert);

        ReadXmlDomParser readXmlDomParser = new ReadXmlDomParser();
        ArrayList<ArrayList> list = readXmlDomParser.readInitFile("init.xml");
        
        ArrayList<Evenement> evenements = list.get(0);
        ArrayList<Salle> sallesList = list.get(1);

        Iterator<Evenement> iterator = evenements.iterator();
        while (iterator.hasNext()) {
            Evenement event = iterator.next();
            System.out.println(event);
        }
        
        Iterator<Salle> iterator1 = sallesList.iterator();
        while (iterator1.hasNext()) {
            Salle salle = iterator1.next();
            System.out.println(salle);
        }

    }
}

/**
 * JAVAFX Hello world!
 *
 */
// public class App extends Application
// {
//     public static void main(String[] args) {
//         launch(args);
//     }
    
//     @Override
//     public void start(Stage primaryStage) {
//         primaryStage.setTitle("Hello World!");
//         Button btn = new Button();
//         btn.setText("Say 'Hello World'");
//         btn.setOnAction(new EventHandler<ActionEvent>() {
 
//             @Override
//             public void handle(ActionEvent event) {
//                 System.out.println("Hello World!");
//             }
//         });
        
//         StackPane root = new StackPane();
//         root.getChildren().add(btn);
//         primaryStage.setScene(new Scene(root, 300, 250));
//         primaryStage.show();
//     }
// }
