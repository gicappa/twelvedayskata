package kata;

/**
 * Starting point of the application contaning the
 * main function.
 */
public class App implements Runnable {


    private final Song song = new Song();

    public App() {
    }

    @Override
    public void run() {
        System.out.println(generateSong());
    }

    // To address the smell I created a class out of the private
    // method.
    //
    // I extracted the method with the test still red.
    // I should find a better way to do it
    private String generateSong() {
        return song.generateSong();
    }

    public static void main(String[] args) {
        var app = new App();

        app.run();
    }

}
