package kata;

public class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return lyrics(1);
    }

    @Override
    public String lyrics(int verseNum) {
        var firstLine = switch (verseNum) {
            case 2 -> "second";
            default -> "first";
        };

        var secondLine = switch (verseNum) {
            case 2 -> "Two turtle doves and\n";
            default -> "";
        };

        return """
            On the %s day of Christmas
            My true love gave to me:
            %s""".formatted(firstLine, secondLine) + "A partridge in a pear tree.";

    }
}
