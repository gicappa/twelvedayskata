package kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SongTest {

    @Test
    void it_returns_the_first_verse() {
        var song = new TwelveDaysSong();

        var actual = song.verse(1);

        assertThat(actual)
            .isEqualTo("""
                On the first day of Christmas
                My true love gave to me:
                A partridge in a pear tree.
                """
            );
    }
}
