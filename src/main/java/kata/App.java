package kata;

/**
 * Starting point of the application contaning the
 * main function.
 */
public class App implements Runnable {


    public App() {
    }

    @Override
    public void run() {
        System.out.println(generateSong());
    }

    // This method extracted is private and this is a smell
    // for a missing class
    // I extracted the method with the test still red.
    // I should find a better way to do it
    private String generateSong() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        var app = new App();

        app.run();
    }

}
