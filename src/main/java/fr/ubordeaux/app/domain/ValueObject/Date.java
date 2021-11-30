package fr.ubordeaux.app.domain.ValueObject;

/**
 * Value of a Date; 
 * dd/mm/yy
 */
public class Date {
    final int day;
    final int month;
    final int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    private String intToString(int num) {
        String output = Integer.toString(num);
        if (output.length() == 1) output = "0" + output;
        return output;
    }

    @Override
    public String toString() {
        return intToString(day) + "/" + intToString(month) + "/" + intToString(year);
    }

    public String toXML() {
        return "<date>" + this.toString() + "</date>";
    }
}
