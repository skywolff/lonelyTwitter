package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    protected Date date;
    protected String moodString;


    protected void setDate(Date date) {
        this.date = date;
    }

    protected void setMoodString(String moodString) {
        this.moodString = moodString;
    }

    public Date getDate() {
        return this.date;
    }

    public String getMoodString() {
        return this.moodString;
    }

    public String format() {
        return this.moodString;
    }
}
