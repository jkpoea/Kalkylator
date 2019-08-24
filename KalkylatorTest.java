package JonatanVuong;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class KalkylatorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testing_AdditionMetod(){
        double num1 = 1.4, num2 = 1.6, expectedResult = 3.0;
        double result = Kalkylator.Addition(num1,num2);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testing_Subtraktion(){
        double num1 = 4.0, num2 = 1.4, expected = 2.6;
        double result = Kalkylator.Subtraktion(num1, num2);
        Assert.assertEquals(expected, result,0);
    }

    @Test
    public void testing_Multi(){
        double num1 = 1.1, num2 = 4, expect = 4.4;
        double result = Kalkylator.Multiplikation(num1, num2);
        Assert.assertEquals(expect, result, 0);
    }

    @Test
    public void testing_Division(){
        double num1 = 14, num2 = 7, expect = 2;
        double result = Kalkylator.Division(num1, num2);
        assertEquals(expect, result, 0);
    }
}
