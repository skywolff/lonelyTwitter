package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood {

    // constructor with default date
    public Happy () {
        super.setDate(new Date(System.currentTimeMillis()));
        super.setMoodString(":)");
    }

    // constructor with date as an arg
    public Happy (Date date) {
        super.setDate(date);
        super.setMoodString(":)");
    }

}
