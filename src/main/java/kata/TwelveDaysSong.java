package kata;

class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return "";
    }

    public String verse(int verseNumber) {
        return """
            On the first day of Christmas
            My true love gave to me:
            A partridge in a pear tree.
            """;
    }
}
