package fr.ubordeaux.app.domain.ValueObject;

public class Capacite {
    //nom de l'Artiste
    private int value;

    public Capacite(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getValue() + "'" +
            "}";
    }

    public String toXML() {
        return "<capacite>" + value + "</capacite>";
    }


    
}