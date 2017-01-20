package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 */

public class HappyMood extends Mood {
    public HappyMood(Date date) {
        super(date);
    }

    public HappyMood() {
        super();
    }

    public String getMood() {
        return "Feeling Happy!";
    }
}
