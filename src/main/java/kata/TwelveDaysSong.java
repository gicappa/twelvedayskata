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
        if (verseNum == 1) {
            return giftList().getFirst();
        }

        return giftList().get(verseNum - 1) + "\n" + numSongLines(verseNum - 1);
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
