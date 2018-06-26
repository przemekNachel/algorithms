package codecool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindPairTest {

    private FindPair findPair;

    @Before
    public void setup() {
        findPair = new FindPair();
    }

    @Test
    public void test_1() {
        int[] array = {1, 4, 45, 6, 10, -8};
        Assert.assertTrue(findPair.find(array, 16));
    }

    @Test
    public void test_2() {
        int[] array = {1, 4, 45, 6, 10, -8};
        Assert.assertFalse(findPair.find(array, 20));
    }

    @Test
    public void test_3() {
        int[] array = {1, 4, 45, 6, 10, -8};
        Assert.assertFalse(findPair.find(array, 8));
    }

    @Test
    public void test_4() {
        int[] array = {1, 4, 45, 6, 10, -8};
        Assert.assertTrue(findPair.find(array, 49));
    }
}
