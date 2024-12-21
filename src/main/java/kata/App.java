package kata;

/**
 * Starting point of the application containing the
 * main function.
 */
public class App implements Runnable {

    private final Song song;

    public App(Song song) {
        this.song = song;
    }


    // Using the object instead of the private method.
    // Passing the object to the constructor to help
    // testability and decoupling.
    //
    // I extracted the method with the test still red.
    // I should find a better way to do it
    @Override
    public void run() {
        System.out.println(song.lyrics());
    }

    public static void main(String[] args) {
        var app = new App(()-> "my actual implementation");

        app.run();
    }

}
