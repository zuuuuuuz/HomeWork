package Home_Work_3.calcs.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCalcAutoSuper{


        @Test
        public void CountOperation2() {
            CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
            Assertions.assertEquals(0, calc.getCountOperation());
        }

        @Test
        public void CountOperation3() {
            CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
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
