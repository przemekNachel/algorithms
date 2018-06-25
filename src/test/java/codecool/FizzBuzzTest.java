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

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
        map = new HashMap<>();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void test_fizzBuzz1() {
        map.put(2, "Parzysta");

        fizzBuzz.fizzBuzz(4, map);

        Assert.assertEquals("1 \n2 Parzysta\n3 Fizz\n4 Parzysta\n", out.toString());
    }

    @Test
    public void test_fizBuzz2() {
        map.put(4, "Cztery");

        fizzBuzz.fizzBuzz(5, map);

        Assert.assertEquals("1 \n2 \n3 Fizz\n4 Cztery\n5 Buzz\n", out.toString());
    }

    @Test
    public void test_fizBuzz3() {
        fizzBuzz.fizzBuzz(15, map);

        Assert.assertEquals("1 \n2 \n3 Fizz\n4 \n5 Buzz\n6 Fizz\n7 Bum\n8 \n9 Fizz\n10 Buzz\n11 \n12 Fizz\n13 \n14 Bum\n15 FizzBuzz\n", out.toString());
    }
}
