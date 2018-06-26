package codecool;

import java.util.HashMap;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        Thread.sleep(10000);
        new FizzBuzz().fizzBuzz(100, new HashMap<Integer, String>());
    }
}
