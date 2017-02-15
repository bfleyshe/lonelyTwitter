package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;


/**
 * Created by bfleyshe on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertEquals(tweets.getCount(), 1);

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        Tweet secondTweet = new NormalTweet("test tweet");

        tweets.addTweet(tweet);
        tweets.addTweet(secondTweet);
        assertEquals(tweet, secondTweet);
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        Tweet secondTweet = new NormalTweet("test tweet two");

        tweets.addTweet(secondTweet);
        tweets.addTweet(tweet);

        ArrayList<Tweet> newTweets = tweets.getTweets();
        assertNotSame(tweets, newTweets);
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("last tweet");

        tweets.addTweet(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));

    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        Tweet anotherTweet = new NormalTweet("also tweet");

        tweets.addTweet(tweet);
        assertEquals(1, tweets.getCount());
        tweets.addTweet(anotherTweet);
        assertEquals(2, tweets.getCount());
        tweets.delete(tweet);
        assertEquals(1, tweets.getCount());
    }
}
