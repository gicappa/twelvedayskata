package kata;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void it_displays_the_computed_song() {
        var song = mock(Song.class);

        when(song.lyrics()).thenReturn("test string");

        var app = new App(song);

        var actual = collectStdOut(app);

        assertThat(actual).isEqualTo("test string\n");
    }

    String collectStdOut(Runnable app) {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        app.run();

        return out.toString();
    }

}
