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
    }

    public static void main(String[] args) {
        var app = new App();

        app.run();
    }

    public String xmasSong() {
        return "song";
    }
}
