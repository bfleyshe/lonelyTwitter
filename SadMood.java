package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 */

public class SadMood extends Mood {
    public SadMood() {
        super();
    }
    public SadMood(Date date) {
        super(date);
    }

    public String getMood(){
        return "Is sad!";
    }
}
