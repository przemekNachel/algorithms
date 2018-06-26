package codecool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgorithmsTest {

    private Algorithms algorithms;

    @Before
    public void setup() {
        algorithms = new Algorithms();
    }

    @Test
    public void test_reverseAString() {
        String expected = "ywoN";

        String reversed = algorithms.reverseAString("Nowy");

        Assert.assertEquals(expected, reversed);
    }

    @Test
    public void test_factorializeNumber() {
        long toFactorialize = 5;

        long factorialized = algorithms.factorialize(toFactorialize);

        Assert.assertEquals(120, factorialized);

    }

    @Test
    public void test_checkPalindrome() {
        String palindrome = "A man, a plan, a canal. Panama";

        Assert.assertTrue(algorithms.isPalindrome(palindrome));
    }

    @Test
    public void test_checkLongestWord() {
        String result = algorithms.findLongestWord("What is the average airspeed velocity of an unladen swallow");

        Assert.assertEquals("8, \"airspeed\"", result);
    }

    @Test
    public void test_titleCase1() {
        String result = algorithms.titleCase("I'm a little tea pot");

        Assert.assertEquals("I'm A Little Tea Pot" , result);
    }

    @Test
    public void test_titleCase2() {
        String result = algorithms.titleCase("HERE IS MY HANDLE HERE IS MY SPOUT");

        Assert.assertEquals("Here Is My Handle Here Is My Spout" , result);
    }
}
