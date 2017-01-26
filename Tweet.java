package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by omer1 on 1/17/17.
 */

public abstract class Tweet {

    private Date date;
    private String message;
    private ArrayList<Mood> moodList;

    public Tweet(Date date, String message) throws TweetTooLongException{
        setDate(date);
        setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException{
        setMessage(message);
        setDate(new Date());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}
