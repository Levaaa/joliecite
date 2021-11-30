package fr.ubordeaux.app.domain.ValueObject;

public class Horaire {
    final int hour;
    final int minute;


    public Horaire(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }


    private String intToString(int num) {
        String output = Integer.toString(num);
        if (output.length() == 1) output = "0" + output;
        return output;
    }

    @Override
    public String toString() {
        return intToString(hour) + "h" + intToString(minute);
    }

    public String toXML() {
        return "<horaire>" + this.toString() + "</horaire>";
    }
}
