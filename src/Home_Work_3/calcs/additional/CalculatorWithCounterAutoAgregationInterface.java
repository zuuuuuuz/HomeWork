package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.api.ICalculator;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoAgregationInterface {
    public ICalculator calc;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator){
        this.calc=calculator;
    }
    public long getCountOperation(){
        return calc.getCountOperation();
    }
}
