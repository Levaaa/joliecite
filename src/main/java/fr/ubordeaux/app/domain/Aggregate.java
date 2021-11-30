package fr.ubordeaux.app.domain;

// R`egles de codage:
// I La valeur de l’identifiant est fournie ou g´en´er´ee `a la
// construction - pas de setter, un seul getter.
// I Les attributs/propri´et´es n’ont pas de setter.
// I Les Entity qui appartiennent `a l’Agregate sont cr´e´ees par lui, il
// fournit l’identifiant.
// I Des traitements m´etiers publiques qui g`erent l’´etat de
// l’Agregate.
// I Ne pas oublier de structurer l’Agregate grˆace aux Value
// Objects pour diminuer la taille de l’Agregate

public class Aggregate {

    Programmation programmation;
    String programmationFileName;
    
    
    public Aggregate(String programmationFileName) {
    }
    
    //METHODS

    // void processProgrammation(DateInterval date){
    //     programmation.processProgrammation(date);
    // }
}