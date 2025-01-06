package kata;

/**
 * Starting point of the application contaning the
 * main function.
 */
public class App implements Runnable {


    private final Song song;

    public App(Song song) {
        this.song = song;
    }

    @Override
    public void run() {
        System.out.println(song.lyrics());
    }

    public static void main(String[] args) {
        var app = new App(()->"");

        app.run();
    }

}
