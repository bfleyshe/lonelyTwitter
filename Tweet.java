package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;


/**
 * Created by bfleyshe on 1/17/17. Superclass that implements tweets
 */
public abstract class Tweet {

    private Date date;
    private String message;
    private ArrayList<Mood> moodList;

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(Date date, String message) throws TweetTooLongException{
        setDate(date);
        setMessage(message);
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(String message) throws TweetTooLongException{
        setMessage(message);
        setDate(new Date());
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}
