import static org.junit.Assert.*;
import org.junit.Test;

public class miniCalculatorTest {
    private miniCalculator testObj;
    private static double DELTA = 1e-15;

    public miniCalculatorTest() {
        testObj = new miniCalculator();
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("SquareRoot test for True Positive", 4, testObj.squareRootFunction(16), DELTA);
        assertEquals("SquareRoot test for True Positive", 16, testObj.squareRootFunction(256), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("SquareRoot test for False Positive", 4, testObj.squareRootFunction(4), DELTA);
        assertNotEquals("SquareRoot test for False Positive", 16, testObj.squareRootFunction(16), DELTA);
    }

    @Test
    public void naturalLogarithmTruePositive(){
        assertEquals("Natural Logarithm test for True Positive", 2.302585092994046, testObj.LogFunction(10), DELTA);
        assertEquals("Natural Logarithm test for True Positive", 4.605170185988091, testObj.LogFunction(100), DELTA);
    }

    @Test
    public void naturalLogarithmFalsePositive(){
        assertNotEquals("Natural Logarithm test for False Positive", 2.302585092994046, testObj.LogFunction(100), DELTA);
        assertNotEquals("Natural Logarithm test for False Positive", -1, testObj.LogFunction(10), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Power for True Positive", 16, testObj.powerFunction(4, 2), DELTA);
        assertEquals("Power for True Positive",Double.NaN, testObj.powerFunction(0, 0), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Calculate Power for False Positive", 10, testObj.powerFunction(4, 2), DELTA);
        assertNotEquals("Calculate Power for False Positive", 1000, testObj.powerFunction(0, 0), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Calculate Factorial for True Positive", 6, testObj.factorialFunction(3), DELTA);
        assertEquals("Calculate Factorial for True Positive", 24, testObj.factorialFunction(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Calculate Factorial for False Positive", 6, testObj.factorialFunction(2), DELTA);
        assertNotEquals("Calculate Factorial for False Positive", 24, testObj.factorialFunction(0), DELTA);
    }

}