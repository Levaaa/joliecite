package fr.ubordeaux.app.domain.ValueObject;

public class NomSalle {

    private String name;

    public NomSalle(String name){
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