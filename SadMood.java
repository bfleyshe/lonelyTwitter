package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bfleyshe on 1/17/17.
 */

public class SadMood extends Mood {
    public SadMood(String mood) {
        super(mood);
    }

    public String getMood(){
        return "Is sad!";
    }
}
