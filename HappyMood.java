package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bfleyshe on 1/17/17.
 */

public class HappyMood extends Mood {
    public HappyMood(String mood) {
        super(mood);
    }

    public String getMood(){
        return "Feeling Happy!";
    }
}
