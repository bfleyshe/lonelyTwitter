package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 * This class is the abstract base class for moods. <br> Used by HappyMood and SadMood currently.
 *
 * @author bfleyshe
 * @version 1.0
 * @see Tweet
 * @since 0.5
 */
public abstract class Mood{

    private String mood;
    /**
     * Date is given by java.util.Date;
     */
    private Date date;


    /**
     * Instantiates a new Mood.
     *
     * @param date the date
     */
    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date(); // uses current date as default
    }

    /**
     *
     * @return returns the date as a string
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date
     * @param date - the date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
