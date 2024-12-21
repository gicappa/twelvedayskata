package kata;

class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return "";
    }

    public String verse(int verseNumber) {
        if (verseNumber ==1) {
            return """
                On the first day of Christmas
                My true love gave to me:
                A partridge in a pear tree.
                """;
        } else {
            return """
                On the second day of Christmas
                My true love gave to me:
                Two turtle doves and
                A partridge in a pear tree.
                """;
        }
    }
}
