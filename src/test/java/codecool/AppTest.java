package codecool;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        try {
            App.main(new String[2]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
