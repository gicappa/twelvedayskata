package kata;

import java.util.List;

public class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return lyrics(1);
    }

    @Override
    public String lyrics(int verseNum) {

        return """
            On the %s day of Christmas
            My true love gave to me:
            %s""".formatted(toOrdinal(verseNum), numSongLines(verseNum));

    }

    private String numSongLines(int verseNum) {
        return switch (verseNum) {
            case 1 -> giftList().get(0);
            case 2 -> giftList().get(1) + "\n" + numSongLines(1);
            case 3 -> giftList().get(2) + "\n" + numSongLines(2);
            default -> "";
        };
    }

    private List<String> giftList() {
        return List.of(
            "A partridge in a pear tree.",
            "Two turtle doves and",
            "Three french hens");
    }

    private String toOrdinal(int cardinal) {
        return switch (cardinal) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            default -> "";
        };
    }
}
