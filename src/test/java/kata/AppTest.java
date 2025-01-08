package kata;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {

    private App app;
    private String actual;
    private String[] verses;

    @BeforeEach
    void beforeEach() {
        app = new App();
        actual = collectStdOut(app);
        verses = actual.split("\n\n");
    }

    @Test
    void it_returns_12_verses_separated_by_a_new_line() {
        assertThat(verses).hasSize(12);
    }

    @Test
    void each_verse_must_count_at_least_three_lines() {
        for (var verse : verses) {
            var lines = verse.split("\n");
            assertThat(lines).hasSizeGreaterThan(2);
        }
    }

    @Test
    void each_verse_has_a_different_first_line() {
        var firstLines = new ArrayList<String>();

        for (var verse : verses) {
            var lines = verse.split("\n");
            firstLines.add(lines[0]);
        }
        assertThat(new HashSet<>(firstLines)).hasSize(12);

    }

    @Test
    void each_verse_has_the_same_second_line() {
        var secondLine = new ArrayList<String>();

        for (var verse : verses) {
            var lines = verse.split("\n");
            secondLine.add(lines[1]);
        }
        assertThat(new HashSet<>(secondLine)).hasSize(1);
    }

    @Disabled
    @Test
    void it_returns_the_whole_song() {
        var actual = collectStdOut(app);

        assertThat(actual).isEqualTo(twelveDaysSong());
    }

    private static String collectStdOut(Runnable app) {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        app.run();

        return out.toString();
    }

    String twelveDaysSong() {
        return """
            On the first day of Christmas
            My true love gave to me:
            A partridge in a pear tree.
            
            On the second day of Christmas
            My true love gave to me:
            Two turtle doves and
            A partridge in a pear tree.
            
            On the third day of Christmas
            My true love gave to me:
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the forth day of Christmas
            My true love gave to me:
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the fifth day of Christmas
            My true love gave to me:
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the sixth day of Christmas
            My true love gave to me:
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the seventh day of Christmas
            My true love gave to me:
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the eight day of Christmas
            My true love gave to me:
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the ninth day of Christmas
            My true love gave to me:
            Nine ladies dancing
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the tenth day of Christmas
            My true love gave to me:
            Ten lords a-leaping
            Nine ladies dancing
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
            
            On the eleventh day of Christmas
            My true love gave to me:
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
            A partridge in a pear tree.
            
            On the Twelfth day of Christmas
            My true love gave to me:
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
            Two turtle doves
            And a partridge in a pear tree.
            """;
    }
}
