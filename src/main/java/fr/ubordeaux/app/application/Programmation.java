package fr.ubordeaux.app.application;

import java.util.ArrayList;

import fr.ubordeaux.app.domain.Entity.Salle;
import fr.ubordeaux.app.domain.Entity.Evenement;

/**
 * C'est elle qui prépare toute la programmation
 * 
 * On peut faire des tableaux (12 puis tableau 31)
 * qui contiennent une classe Day qui est la programmation de la journée
 */
public class Programmation {


    ArrayList<Salle> salleList = new ArrayList<Salle>();

    public Programmation() {
    }

    //METHODS
    public void doAnnualProgrammation(ArrayList<Salle> salleList, ArrayList<Evenement> evenementList) {

        // Chaque semaine doit proposer au moins un concert par salle si il y en a assez de disponible.
        if (evenementList.size() < 52 * salleList.size()) {
            //la condition ne sera pas respectée
        }

        // Date date = new Date (1,1,21);

        // while (!date.isEndOfYear()){

        //     //DO STUFF



        //     date.passOneWeek();
        // }









    }
    
}
