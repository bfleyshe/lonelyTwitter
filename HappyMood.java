package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 * This class is a subclass of the superclass Mood. <br> In this class, the Happy mood is returned
 *
 * @author bfleyshe
 * @version 1.0
 * @see Tweet
 * @since 0.5
 */

public class HappyMood extends Mood {
    public HappyMood(Date date) {
        super(date);
    }

    /**
     * Constructor for HappyMood that borrows from superclass Mood.
     */
    public HappyMood() {
        super();
    }

    /**
     * Gets the Happy mood in this class
     * @return the Happy Mood as a String
     */
    public String getMood() {
        return "Feeling Happy!";
    }
}
