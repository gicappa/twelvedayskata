package kata;

public class Song {

    public Song() {
    }

    // This method extracted is private and this is a smell
    // for a missing class
    // I extracted the method with the test still red.
    // I should find a better way to do it
    String lyrics() {
        return "Hello World!";
    }
}