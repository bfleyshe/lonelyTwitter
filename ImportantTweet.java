package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 * This class is a subclass of the superclass Tweet. <br> In this class, the Important Tweet is managed.
 *
 * @author bfleyshe
 * @version 1.0
 * @see Tweet
 * @since 0.5
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Constructs the tweet with a message parameter.
     * @param message - the message to create the tweet with
     * @throws TweetTooLongException - Exception if the message is >140 char
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * @return Returns True
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    /**
     * @return - Returns string with "!!!!" appended
     */
    @Override
    public String getMessage(){
        return super.getMessage() + " !!!!";
    }
}
