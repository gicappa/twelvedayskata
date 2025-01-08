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

    public static String tail(int number) {
        var wholeTail = """
            Twelve drummers drumming
            Eleven pipers piping
            Ten lords a-leaping
            Nine ladies dancing
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.""";

        var lines = wholeTail.split("\n");

        var result = new StringBuilder();
        for (var i = 12 - number; i < 12; i++) {
            result.append(lines[i]);

            if (i != 11) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        var app = new App();

        app.run();
    }
}
