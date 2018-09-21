package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {

    TweetTooLongException() {
        super("Tweet is too long, please keep it within 140 characters!");
    }

}
