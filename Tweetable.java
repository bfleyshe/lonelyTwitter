package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate();

    /**
     * Gets mood.
     *
     * @return the mood
     */
    public String getMood();
}
