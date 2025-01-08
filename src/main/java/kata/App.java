package kata;

import static java.lang.System.out;
import static java.util.stream.Collectors.joining;

import java.util.stream.IntStream;

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
        return IntStream.rangeClosed(1, 12)
            .mapToObj(App::verse)
            .collect(joining("\n"));
    }

    private static String verse(int number) {

        return """
            first line - %d
            second line
            %s""".formatted(number, tail(number));
    }

    private static String tail(int number) {
        var tail = new StringBuilder();

        for(var i = 1; i <= number; i++) {
            tail.append("tail - ").append(i).append("\n");
        }
        return tail.toString();
    }

    public static void main(String[] args) {
        var app = new App();

        app.run();
    }

}
