package codecool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void test_getThird() {
        Assert.assertEquals(2, fibonacci.get(3));
    }

    @Test
    public void test_getFifth() {
        Assert.assertEquals(5, fibonacci.get(5));
    }

    @Test
    public void test_getSixth() {
        Assert.assertEquals(8, fibonacci.get(6));
    }

    @Test
    public void test_getFortySixth() {
        Assert.assertEquals(1836311903, fibonacci.get(46));
    }

    @Test
    public void test_getOneHundreadth() {
        Assert.assertEquals(1836311903, fibonacci.get(46));
    }
}
