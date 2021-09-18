import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorBaesicTest {

    @Test
    public void addNumbersTest() {
        CalculatorBaesic myCalc = new CalculatorBaesic();
        assertEquals(10, myCalc.addNumbers(5,5));
    }

    @Test
    public void subtractNumbersTest() {
        CalculatorBaesic myCalc = new CalculatorBaesic();
        assertEquals(10,myCalc.subtractNumbers(10,5));
    }
}