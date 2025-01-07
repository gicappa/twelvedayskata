package kata;

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
            case 1 -> "A partridge in a pear tree.";
            case 2 -> "Two turtle doves and\n" + numSongLines(1);
            case 3 -> "Three french hens\n" + numSongLines(2);
            default -> "";
        };
    }

    private String toOrdinal(int verseNum) {
        return switch (verseNum) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            default -> "";
        };
    }
}
