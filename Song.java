/**
 * File for a Song class to be used in the Playlist Project
 * @author Steven Li and Dario Soatto
 * @version 01/12/2023
 */
public class Song {
    //Fields-- what information do we want each Song to store?

    private String title;
    private String artist;
    private int minutes;
    private int seconds;
    private boolean liked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (String myTitle, String myArtist, int myMinutes, int mySeconds, boolean myLiked){
        title = myTitle;
        artist = myArtist;
        minutes = myMinutes;
        seconds = mySeconds;
        liked = myLiked;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean getLiked() {
        return liked;
    }

    public void changeLike() {
        liked = !liked;
    }

    public String toString() {
        return "\"" + title + "\" by " + artist + " (" + minutes + ":" + seconds + ")";
    }
}
