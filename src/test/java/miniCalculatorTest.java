import org.junit.Test;
import org.junit.Assert;

public class miniCalculatorTest {
    private miniCalculator testObj;

    public miniCalculatorTest() {
        testObj = new miniCalculator();
    }

    @Test
    public void sqrt(){
        int num = 4;
        double expResult = 2.0;
        double result = testObj.sqrt(num);
        Assert.assertEquals(expResult, result, 0);
    }
}