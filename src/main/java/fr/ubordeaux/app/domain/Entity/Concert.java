package fr.ubordeaux.app.domain.Entity;

import fr.ubordeaux.app.domain.ValueObject.Artiste;
import fr.ubordeaux.app.domain.ValueObject.Date;

public class Concert extends Evenement{

    private static int UNIQUE_ID = 0;
    private final int id = UNIQUE_ID++;

    private Date date;
    private Artiste artist;

    public Concert(Date date, Artiste artist) {
        this.date = date;
        this.artist = artist;
    }
    
    public Concert(Artiste artist) {
        this.artist = artist;
    }

    public Date getDate() {
        return this.date;
    }   

    public Artiste getArtist() {
        return this.artist;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", date='" + getDate() + "'" +
            ", artist='" + getArtist() + "'" +
            "}";
    }

    public String toXML() {
        return "<Concert>\n" + artist.toXML() + "\n</Concert>";
    }
    
}
