package fr.ubordeaux.app.domain.ValueObject;

public class Piece {
    //nom de l'Artiste
    private String name;

    public Piece(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }

    public String toXML() {
        return "<nom>" + name + "</nom>";
    }


    
}