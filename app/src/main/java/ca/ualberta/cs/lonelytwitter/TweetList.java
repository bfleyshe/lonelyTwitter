package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by bfleyshe on 2/14/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){

        if(this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){

        for(int i = 0; i < this.getCount(); i++) {
            for (int j = 0; i < this.getCount(); i++) {
                if (tweets.get(i) == tweets.get(j)) {
                    return true;
                }
            }
        }

        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){

        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){

        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){// assumes that chronological order by order added into the list
        return tweets;
    }

    public int getCount(){

        return tweets.size();
    }

    public int compare(Tweet tweet1, Tweet tweet2){
        if(tweet1.getDate()==tweet2.getDate())
            return 0;
        else if(tweet1.getDate().before(tweet2.getDate()))
            return 1;
        else
            return -1;
    }
}
