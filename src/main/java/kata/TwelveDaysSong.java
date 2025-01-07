package kata;

import static java.util.stream.Collectors.joining;

import java.util.List;
import java.util.stream.IntStream;

public class TwelveDaysSong implements Song {

    @Override
    public String lyrics() {
        return IntStream.rangeClosed(1, getDays().size())
            .mapToObj(this::verse)
            .collect(joining("\n\n"));
    }

    @Override
    public String verse(int number) {
        return """
            On the %s day of Christmas
            My true love gave to me:%s""".formatted(day(number).ordinal(), allGiftsUntilDay(number));
    }

    private static Day day(int number) {
        return getDays().get(number - 1);
    }

    private String allGiftsUntilDay(int dayNumber) {
        if (dayNumber == 0) {
            return "";
        }

        return "\n" + day(dayNumber).gift() + allGiftsUntilDay(dayNumber - 1);
    }

    private static List<Day> getDays() {
        return List.of(
            new Day("first", "A partridge in a pear tree."),
            new Day("second", "Two turtle doves and"),
            new Day("third", "Three french hens"),
            new Day("forth", "Four calling birds"),
            new Day("fifth", "Five golden rings"),
            new Day("sixth", "Six geese a-laying"),
            new Day("seventh", "Seven swans a-swimming"),
            new Day("eighth", "Eight maids a-milking"),
            new Day("ninth", "Nine ladies dancing"),
            new Day("tenth", "Ten lords a-leaping"),
            new Day("eleventh", "Eleven pipers piping"),
            new Day("twelfth", "Twelve drummers drumming"));
    }

}
