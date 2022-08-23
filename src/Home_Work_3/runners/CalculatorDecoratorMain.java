package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import Home_Work_3.calcs.additional.CalculatorWithMemoryDecorator;
import Home_Work_3.calcs.api.ICalculator;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;



public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithMemoryDecorator calculator =  new CalculatorWithMemoryDecorator(new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends()));
        double result = calculator.plus(4.1,(calculator.plus(calculator.multiple(15,7)
                ,calculator.pow(calculator.divide(28,5),2))));
        System.out.println("Результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = "+CalculatorWithMemoryDecorator.getMemory());
        System.out.println(CalculatorWithCounterAutoDecorator.getCalculator());
        System.out.println(CalculatorWithMemoryDecorator.getCalculator());
    }
}