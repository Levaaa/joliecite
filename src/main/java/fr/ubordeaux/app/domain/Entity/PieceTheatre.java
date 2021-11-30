package fr.ubordeaux.app.domain.Entity;

import fr.ubordeaux.app.domain.ValueObject.Artiste;
import fr.ubordeaux.app.domain.ValueObject.Date;
import fr.ubordeaux.app.domain.ValueObject.DateInterval;
import fr.ubordeaux.app.domain.ValueObject.Piece;

public class PieceTheatre extends Evenement{
    private static int UNIQUE_ID = 0;
    private final int id = UNIQUE_ID++;

    //On part du principe que la picece sera joué de start a end (exemple de startingDay = 10 a endingDay = 12 novembre donc le 10 le 11 et le 12 novembre)
    private DateInterval dateInterval;
    private Piece name;
    private int numInterval;

    public PieceTheatre(Piece name, int numInterval) {
        this.name = name;
        this.numInterval = numInterval;
    }

    public DateInterval getDateInterval() {
        return this.dateInterval;
    }   


    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", numInterval='" + numInterval + "'" +
            "}";
    }

    //voir plus trad le format de sauvegarde
    public String toXML() {
        return "<PieceTheatre>\n" + name.toXML() + "\n</PieceTheatre>";
    }
    


}
