import java.util.ArrayList;
/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist songs = new Playlist();
        
        //Make your playlist here

        System.out.println("Adding songs to the Playlist...\n");
        songs.addSong(new Song("My Life", "Billy Joel", 4, 44));
        songs.addSong(new Song("Vienna", "Billy Joel", 4, 22));
        songs.addSong(new Song("Piano Man", "Billy Joel", 3, 22));
        songs.addSong(new Song("Uptown Girl", "Billy Joel", 3, 18));
        songs.addSong(new Song("New York State of Mind", "Billy Joel", 6, 3));
        songs.addSong(new Song("The Longest Time", "Billy Joel", 3, 38));


        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        songs.displaySongs();

        System.out.println("\nLiking the songs in position 0, 2, and 4...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        songs.likeUnlike(0);
        songs.likeUnlike(2);
        songs.likeUnlike(4);


        System.out.println("Printing the songs...\n");
        songs.displaySongs();


        System.out.println("\nRemoving the song in position 1...\n");
        songs.removeSong(1);

        System.out.println("Printing the songs...\n");
        songs.displaySongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        songs.displayLiked();


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(songs.totalDuration());


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        songs.removeUnliked();


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        songs.displaySongs();
    }
}
