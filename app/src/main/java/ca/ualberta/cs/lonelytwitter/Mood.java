package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    protected Date date;

    protected void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public abstract String format();
}
