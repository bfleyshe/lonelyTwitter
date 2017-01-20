package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 */

public abstract class Mood implements Tweetable{

    private String mood;
    private Date date;

    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    public Mood() {
        this.date = "2017.01.01";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
