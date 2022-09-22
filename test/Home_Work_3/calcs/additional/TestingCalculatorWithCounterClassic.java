package Home_Work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCalculatorWithCounterClassic {
    @Test
    public void CountOperation1() {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        calc.incrementCountOperation();
        calc.incrementCountOperation();
        Assertions.assertEquals(2, calc.getCountOperation());
    }

    @Test
    public void CountOperation2() {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        Assertions.assertEquals(0, calc.getCountOperation());
    }
}
