package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
