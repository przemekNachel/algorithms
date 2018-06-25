package codecool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanConverterTest {

    private RomanConverter romanConverter;

    @Before
    public void setup() {
        romanConverter = new RomanConverter();
    }

    @Test
    public void test_convert5() {
        String result = romanConverter.toRoman(5);
        Assert.assertEquals("V", result);
    }

    @Test
    public void test_convert9() {
        String result = romanConverter.toRoman(9);
        Assert.assertEquals("IX", result);
    }

    @Test
    public void test_convertV() {
        int result = romanConverter.toArabic("V");
        Assert.assertEquals(5, result);
    }

    @Test
    public void test_convertIX() {
        int result = romanConverter.toArabic("IX");
        Assert.assertEquals(9, result);
    }
}
