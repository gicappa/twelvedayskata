package kata;

class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return "";
    }

    public String verse(int verseNumber) {

        if (verseNumber == 1) {
            return firstLine("first") + getFirstVerse() + lastLine();
        } else {
            return firstLine("second") + getSecondVerse() + lastLine();
        }
    }

    private String getSecondVerse() {
        return """
            My true love gave to me:
            Two turtle doves and
            """;
    }

    private String getFirstVerse() {
        return """
            My true love gave to me:
            """;
    }

    private String firstLine(String ordinal) {
        return "On the %s day of Christmas\n".formatted(ordinal);

    }

    private static String lastLine() {
        return "A partridge in a pear tree.\n";
    }
}
