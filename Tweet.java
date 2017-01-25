package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bfleyshe on 1/17/17.
 */

public abstract class Tweet implements Tweetable{

    private Date date;
    private String message;
    private String hiddenString;

    //adding a way for each tweet to have a list of moods
    private String mood;
    private ArrayList<Object> moodList = new ArrayList<Object>();

    public ArrayList<Object> getMoodList() {
        return moodList;
    }

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException{
        this.setMessage(message);
        this.date = new Date(); // current time and date
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }


    //mood extension
    public String getMood(){
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setMoodList(ArrayList<Object> moodList) {
        this.moodList = moodList;
    }

    public ArrayList<Object> getMoodList(ArrayList<Object> moodList) {
        return moodList;
    }

    public void addMood(ArrayList<Object> moodList, String mood){
        moodList.add(mood);
    }

    public void removeMood(ArrayList<Object> moodList, String mood){
        moodList.remove(mood);
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            throw new TweetTooLongException();
        } else{
            this.message = message;
        }
    }

}
