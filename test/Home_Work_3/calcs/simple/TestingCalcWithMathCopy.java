package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCalcWithMathCopy {
    @Test
    public void plus1() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(2, calc.plus(1, 1));
    }

    @Test
    public void plus2() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(0, calc.plus(-1, 1));
    }

    @Test
    public void plus3() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(1, calc.plus(0, 1));
    }

    @Test
    public void minus1() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(0, calc.minus(1, 1));
    }

    @Test
    public void minus2() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(-2, calc.minus(-1, 1));
    }

    @Test
    public void minus3() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(-1, calc.minus(0, 1));
    }

    @Test
    public void multiple1() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(1, calc.multiple(1, 1));
    }

    @Test
    public void multiplication2() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(10, calc.multiple(2, 5));
    }

    @Test
    public void multiple3() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(0, calc.multiple(0, 1));
    }

    @Test
    public void multiple4() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(-10, calc.multiple(5, -2));
    }

    @Test
    public void divide() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(10, calc.divide(100, 10));
    }

    @Test
    public void divide2() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(10, calc.divide(10, 1));
    }

    @Test
    public void divide3() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(-10, calc.divide(100, -10));
    }

    @Test
    public void sqrt() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(0, calc.sqrt(0));
    }

    @Test
    public void module1() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(16, calc.module(-16));
    }

    @Test
    public void module2() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(0, calc.module(0));
    }

    @Test
    public void module3() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(16, calc.module(16));
    }

    @Test
    public void pow1() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(16, calc.pow(2, 4));
    }

    @Test
    public void pow2() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(0, calc.pow(0, 2));
    }

    @Test
    public void pow3() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(0.25, calc.pow(2, -2));
    }

    @Test
    public void pow4() {
        ICalculator calc = new CalculatorWithMathCopy();
        Assertions.assertEquals(1, calc.pow(16, 0));
    }
}
