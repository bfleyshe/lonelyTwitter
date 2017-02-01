package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 * This class is a subclass of the superclass Mood. <br> In this class, the Sad mood is returned
 *
 * @author bfleyshe
 * @version 1.0
 * @see Tweet
 * @since 0.5
 */

public class SadMood extends Mood {
    public SadMood() {
        super();
    }
    public SadMood(Date date) {
        super(date);
    }

    /**
     * Gets the Sad mood in this class
     * @return the Sad Mood as a String
     */
    public String getMood(){
        return "Is sad!";
    }
}
