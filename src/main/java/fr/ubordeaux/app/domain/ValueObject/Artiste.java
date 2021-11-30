package fr.ubordeaux.app.domain.ValueObject;

public class Artiste {
    //nom de l'Artiste
    private String name;

    public Artiste(String name){
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
        return "<artiste>" + name + "</artiste>";
    }


    
}