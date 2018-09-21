package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected ArrayList<Mood> moodList = new ArrayList<Mood>();

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void addMood(Mood mood) {
        this.moodList.add(mood);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    public abstract Boolean isImportant();
}
