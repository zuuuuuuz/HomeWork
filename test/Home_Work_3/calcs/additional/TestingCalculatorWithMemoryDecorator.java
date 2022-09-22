package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCalculatorWithMemoryDecorator {
    @Test
    public void Memory1() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.plus(2, 2);
        Assertions.assertEquals(4, calc.getMemory());
    }

    @Test
    public void Memory2() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.plus(2, 2);

        calc.getMemory();
        Assertions.assertEquals(0, calc.getMemory());
    }

    @Test
    public void Memory3() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calc.getMemory();
        Assertions.assertEquals(0, calc.getMemory());
    }
}
