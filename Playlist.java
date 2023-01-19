import java.util.ArrayList;

    /**
     * The Playlist class, which will keep track of a playlist of Song objects
     * Refer to the project description to make sure you have access to all available methods
     */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> songs;
    



    /**
    * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
    * then use additional methods to add Songs in one-by-one
    */
    public Playlist(){
        songs = new ArrayList<Song>();
    }

      

    /**
     * Methods-- Remember that you need to be able to complete all of the following:
     * Adding a song
     * 'liking' a song
     * Removing a specific song
     * Examining all Songs (a String return or void print makes sense here)
     * Examining a sublist of all liked songs
     * Determining the total duration of all songs
     * Removing all unliked songs from the playlist (careful with this one!)
     */

    public void addSong(Song newSong) {
        songs.add(newSong);
    }

    public void likeUnlike(int position) {
        (songs.get(position)).changeLike();
    }

    public void removeSong(int position) {
        songs.remove(position);
    }
    
    public void displaySongs() {
        for(int i = 0; i < songs.size(); i++) {
            System.out.println(songs.get(i));
        }
    }

    public void displayLiked() {
        for(int i = 0; i < songs.size(); i++) {
            if((songs.get(i)).getLiked() == true) {
                System.out.println(songs.get(i));
            }
        }
    }

    public String totalDuration() {
        int s = 0;
        int m = 0;
        for(int i = 0; i < songs.size(); i++) {
            s += (songs.get(i)).getSeconds();
            m += (songs.get(i)).getMinutes();
            if(s >= 60) {
                m++;
                s = s - 60;
            }
        }
        if(s >= 10) {
            return "" + m + ":" + s;
        } else {
            return "" + m + ":0" + s;
        }
        
    }

    public void removeUnliked() {
        for(int i = 0; i < songs.size(); i++) {
            if((songs.get(i)).getLiked() == false) {
                songs.remove(i);
                i--;
            }
        }
    }
}
