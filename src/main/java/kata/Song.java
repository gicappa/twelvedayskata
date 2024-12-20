package kata;


// I tried to use a lambda to implement this
// single method object and the code suggested me
// transform Song into an interface to be a functional
// interface. Let's do it!
@FunctionalInterface
interface Song {
    String lyrics();
}