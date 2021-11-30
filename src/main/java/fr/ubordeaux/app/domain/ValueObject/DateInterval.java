package fr.ubordeaux.app.domain.ValueObject;

public class DateInterval {

    private Date startingDay;
    private Date endingDay;

    public DateInterval(Date startingDay, Date endingDay){
        this.startingDay = startingDay;
        this.endingDay = endingDay;
    }


    public Date getStartingDay() {
        return this.startingDay;
    }

    public Date getEndingDay() {
        return this.endingDay;
    }

}