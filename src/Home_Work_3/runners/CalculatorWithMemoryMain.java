package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithMathExtends;
import Home_Work_3.calcs.additional.CalculatorWithMemory;
import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        ICalculator I = new CalculatorWithMathExtends();
        CalculatorWithMemory calc=new CalculatorWithMemory(I);
        calc.plus(4.1,(calc.plus(calc.multiple(15,7),calc.pow(calc.divide(28,5),2))));
        calc.setMemory();
        System.out.println("Результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calc.getMemory());
        System.out.println("счетчик: " + calc.getCountOperation());
    }
}
