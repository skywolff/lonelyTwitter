package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Mood {

    // constructor with default date
    public Sad () {
        super.setDate(new Date(System.currentTimeMillis()));
    }

    // constructor with date as an arg
    public Sad (Date date) {
        super.setDate(date);
    }

    @Override
    public String format() {
        return ":(";
    }
}
