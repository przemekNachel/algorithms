package codecool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    private Map<Integer, String> map;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final static String newLine = System.getProperty("line.separator");

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
        map = new HashMap<>();
        System.setOut(new PrintStream(out));
        System.getProperty("line.separator");
    }

    @Test
    public void test_fizzBuzz1() {
        map.put(2, "Parzysta");

        fizzBuzz.fizzBuzz(4, map);

        Assert.assertEquals("1 " + newLine + "2 Parzysta" + newLine + "3 Fizz" + newLine + "4 Parzysta" + newLine + "", out.toString());
    }

    @Test
    public void test_fizBuzz2() {
        map.put(4, "Cztery");

        fizzBuzz.fizzBuzz(5, map);

        Assert.assertEquals("1 " + newLine + "2 " + newLine + "3 Fizz" + newLine + "4 Cztery" + newLine + "5 Buzz" + newLine + "", out.toString());
    }

    @Test
    public void test_fizBuzz3() {
        fizzBuzz.fizzBuzz(15, map);

        Assert.assertEquals("1 " + newLine + "2 " + newLine + "3 Fizz" + newLine + "4 " + newLine + "5 Buzz" + newLine + "6 Fizz" + newLine + "7 Bum" + newLine + "8 " + newLine + "9 Fizz" + newLine + "10 Buzz" + newLine + "11 " + newLine + "12 Fizz" + newLine + "13 " + newLine + "14 Bum" + newLine + "15 FizzBuzz" + newLine + "", out.toString());
    }
}
