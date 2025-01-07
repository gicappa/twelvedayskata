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
            return giftNumber(verseNum);
        }

        return giftNumber(verseNum) + "\n" + numSongLines(verseNum - 1);
    }

    private String giftNumber(int giftNumber) {
        return List.of(
                "A partridge in a pear tree.",
                "Two turtle doves and",
                "Three french hens",
                "Four calling birds",
                "Five golden rings",
                "Six geese a-laying",
                "Seven swans a-swimming",
                "Eight maids a-milking",
                "Nine ladies dancing",
                "Ten lords a-leaping",
                "Eleven pipers piping",
                "Twelve drummers drumming")
            .get(giftNumber - 1);
    }

    private String toOrdinal(int cardinal) {
        return switch (cardinal) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            case 4 -> "forth";
            case 5 -> "fifth";
            case 6 -> "sixth";
            case 7 -> "seventh";
            case 8 -> "eighth";
            case 9 -> "ninth";
            case 10 -> "tenth";
            case 11 -> "eleventh";
            case 12 -> "twelfth";
            default -> "";
        };
    }
}
