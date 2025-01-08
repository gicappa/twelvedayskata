package kata;

import static java.lang.System.out;

/**
 * Starting point of the application contaning the main function.
 */
public class App implements Runnable {


    public App() {
    }

    @Override
    public void run() {
        out.println("""
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            
            Hello World!
            """);
    }

    public static void main(String[] args) {
        var app = new App();

        app.run();
    }

}
