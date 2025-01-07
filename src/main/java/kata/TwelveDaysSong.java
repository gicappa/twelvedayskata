package kata;

public class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return lyrics(1);
    }

    @Override
    public String lyrics(int verseNum) {
        if (verseNum == 2) {
            return """
                    On the second day of Christmas
                    My true love gave to me:
                    Two turtle doves and
                    A partridge in a pear tree.""";
        }

        return """
                On the first day of Christmas
                My true love gave to me:
                A partridge in a pear tree.""";
    }
}
