import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();

    }

    @Test
    public void addNumbers(){
        assertEquals(15, calculator.add(5, 10));
    }

    @Test
    public void subtractNumbers(){
        assertEquals(2, calculator.subtract(10, 8));
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void divideNumbers(){
        assertEquals(5, calculator.divide(10,2));
    }

}
