package Home_Work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCalculatorWithCounterAutoComposite {
    @Test
    public void CountOperation1() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        Assertions.assertEquals(0, calc.getCounter());
    }

    @Test
    public void CountOperation() {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        calc.plus(1, 1);
        calc.pow(1, 1);
        calc.module(1);
        calc.divide(1, 1);
        calc.multiple(1, 1);
        calc.sqrt(1);
        calc.minus(1, 1);
        Assertions.assertEquals(7, calc.getCounter());
    }
}
