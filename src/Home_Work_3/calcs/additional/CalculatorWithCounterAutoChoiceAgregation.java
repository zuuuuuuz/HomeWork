package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private long countOperation;
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator a){
        this.calculator1 = a;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy a){
        this.calculator2 = a;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends a){
        this.calculator3 = a;
    }



    public long getCountOperation() {
        if (calculator2 == null && calculator3 == null){
            return calculator1.getCountOperation();
        }else if (calculator1 == null && calculator2 == null) {
            return calculator3.getCountOperation();
        }   return calculator2.getCountOperation();
    }
}
