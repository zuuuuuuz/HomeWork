package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCalculatorWithMemory {

    @Test
    public void CountOperation2() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        Assertions.assertEquals(0, calc.getCountOperation());
    }

    @Test
    public void CountOperation3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.plus(1, 1);
        calc.pow(1, 1);
        calc.module(1);
        calc.divide(1, 1);
        calc.multiple(1, 1);
        calc.sqrt(1);
        calc.minus(1, 1);
        Assertions.assertEquals(7, calc.getCountOperation());
    }


    @Test
    public void Memory3() {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathExtends());
        calc.plus(2, 2);
        calc.getMemory();
        Assertions.assertEquals(0, calc.getMemory());
    }

}
