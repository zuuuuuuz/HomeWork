package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import Home_Work_3.calcs.api.ICalculator;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithOperator();

        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(calc);

        double result = calculator.calc.module(calculator.calc.plus(calculator.calc.plus(calculator.calc.pow(
                calculator.calc.divide(28,5),2),calculator.calc.multiple(15,7)), 4.1));

        System.out.println("Результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Счетчик вызовов: " + calculator.getCountOperation());
    }
}
