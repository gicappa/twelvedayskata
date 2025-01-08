package kata;

import static java.lang.System.out;

/**
 * Starting point of the application contaning the main function.
 */
public class App implements Runnable {


    public App() {
    }

    @Override
    public void run() {
        out.println(song());
    }

    private static String song() {
        var song = new StringBuilder();

        for (int i = 0; i < 11; i++) {
            song.append("Hello World!\n");
            song.append("\n");
        }
        return song.toString();
    }

    public static void main(String[] args) {
        var app = new App();

        app.run();
    }

}
