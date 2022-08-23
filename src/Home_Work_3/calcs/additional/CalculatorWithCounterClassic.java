package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation;

    public void incrementCountOperation(){
        this.countOperation=this.countOperation+1;
    }

    public long getCountOperation(){
        return countOperation;
    }
}
