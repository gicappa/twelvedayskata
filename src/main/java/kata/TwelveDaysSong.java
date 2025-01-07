package kata;

import static java.util.stream.Collectors.joining;

import java.util.List;
import java.util.stream.IntStream;

public class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return IntStream.rangeClosed(1, 12)
            .mapToObj(this::verse)
            .collect(joining("\n\n"));
    }

    @Override
    public String verse(int number) {
        return """
            On the %s day of Christmas
            My true love gave to me:
            %s""".formatted(toOrdinal(number), allGiftsUntilDay(number));
    }

    private String allGiftsUntilDay(int dayNumber) {
        if (dayNumber == 1) {
            return giftNumber(dayNumber);
        }

        return giftNumber(dayNumber) + "\n" + allGiftsUntilDay(dayNumber - 1);
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
        return List.of(
                "first", "second", "third",
                "forth", "fifth", "sixth",
                "seventh", "eighth", "ninth",
                "tenth", "eleventh", "twelfth")
            .get(cardinal - 1);
    }

}
