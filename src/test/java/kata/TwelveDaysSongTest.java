package kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TwelveDaysSongTest {

    @Test
    void it_returns_the_first_verse() {
        var song = new TwelveDaysSong();

        var actual = song.lyrics(1);

        assertThat(actual).isEqualTo("On the first day of Christmas\nMy true love gave to me:\nA partridge in a pear tree.");
    }

    @Test
    void it_returns_the_second_verse() {
        var song = new TwelveDaysSong();

        var actual = song.lyrics(2);

        assertThat(actual).isEqualTo("""
                On the second day of Christmas
                My true love gave to me:
                Two turtle doves and
                A partridge in a pear tree.""");
    }

}
