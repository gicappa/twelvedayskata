package kata;

public class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return lyrics(1);
    }

    @Override
    public String lyrics(int verseNum) {
        return """
                On the first day of Christmas
                My true love gave to me:
                A partridge in a pear tree.""";
    }
}
