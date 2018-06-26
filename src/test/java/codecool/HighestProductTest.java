package codecool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HighestProductTest {

    private HighestProduct highestProduct;

    @Before
    public void setup() {
        highestProduct = new HighestProduct();
    }

    @Test
    public void test_1() {
        int[] array = {1,4,5,8};
        Assert.assertEquals(160, highestProduct.get(array));
    }

    @Test
    public void test_2() {
        int[] array = {-11,-44,5,8};
        Assert.assertEquals(3872, highestProduct.get(array));
    }

    @Test
    public void test_3() {
        int[] array = {10,4,10,1};
        Assert.assertEquals(400, highestProduct.get(array));
    }

    @Test
    public void test_4() {
        int[] array = {-5,-4,5,3};
        Assert.assertEquals(100, highestProduct.get(array));
    }

    @Test
    public void test_5() {
        int[] array = {-5,4,5,9};
        Assert.assertEquals(180, highestProduct.get(array));
    }

    @Test
    public void test_6() {
        int[] array = {-10,-10,9, 10};
        Assert.assertEquals(1000, highestProduct.get(array));
    }

    @Test
    public void test_7() {
        int[] array = {-10,-10,9, 10, 9};
        Assert.assertEquals(1000, highestProduct.get(array));
    }

    @Test
    public void test_8() {
        int[] array = {-8, -8, 9, 10, 9};
        Assert.assertEquals(810, highestProduct.get(array));
    }
}
