package kata;

import java.util.Map;

class TwelveDaysSong implements Song {

    private final Map<String, String> verses = Map.of(
        "first", "A partridge in a pear tree.\n",
        "second", "Two turtle doves and\n"
    );

    @Override
    public String lyrics() {
        return "";
    }

    public String verse(int verseNumber) {

        if (verseNumber == 1) {
            return getFirstLine("first") +
                getSecondLine() +
                verses.get("first");
        } else {
            return getFirstLine("second") +
                getSecondLine() +
                verses.get("second") +
                verses.get("first");
        }
    }

    private String getFirstLine(String ordinal) {
        return "On the %s day of Christmas\n".formatted(ordinal);
    }

    private String getSecondLine() {
        return "My true love gave to me:\n";
    }

}
