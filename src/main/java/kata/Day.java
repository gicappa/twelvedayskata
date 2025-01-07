package kata;

public class Day {

    private final String ordinal;
    private final String gift;

    public Day(String ordinal, String gift) {
        this.ordinal = ordinal;
        this.gift = gift;
    }

    public String ordinal() {
        return ordinal;
    }

    public String gift() {
        return gift;
    }
}
