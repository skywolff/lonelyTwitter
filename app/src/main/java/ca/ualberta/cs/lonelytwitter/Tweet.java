package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
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

    public abstract Boolean isImportant();
}
