package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCalculatorWithCounterAutoDecorator {
    @Test
    public void CountOperation1() {
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());
        Assertions.assertEquals(7, calc.getCountOperation());
    }

    @Test
    public void CountOperation() {
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());
        calc.plus(1, 1);
        calc.pow(1, 1);
        calc.module(1);
        calc.divide(1, 1);
        calc.multiple(1, 1);
        calc.sqrt(1);
        calc.minus(1, 1);
        Assertions.assertEquals(7, calc.getCountOperation());
    }

}
