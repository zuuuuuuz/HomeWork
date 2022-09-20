package Home_Work_1;

import Home_Work_3.calcs.additional.CalculatorWithMemory;
import Home_Work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main1 {
    @Test
    public void test(){
        CalculatorWithOperator calc = new CalculatorWithOperator();
        Assertions.assertEquals(2,calc.plus(1,1));
    }

}
