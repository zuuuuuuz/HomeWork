package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import Home_Work_3.calcs.simple.CalculatorWithMathCopy;
import Home_Work_3.calcs.simple.CalculatorWithMathExtends;
import Home_Work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calculator2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculator3 = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calc=new CalculatorWithCounterAutoChoiceAgregation((calculator1));
        double result;

        result= calculator1.plus(4.1,(calculator1.plus(calculator1.multiple(15,7),calculator1.pow(
                calculator1.divide(28,5),2))));

        System.out.println("\n_____________________конструктор CalculatorWithOperator__________________________");
        System.out.println("через данный конструктор результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Счетчик вызовов этого конструктора: "+calc.getCountOperation());


        CalculatorWithCounterAutoChoiceAgregation calc1=new CalculatorWithCounterAutoChoiceAgregation((calculator1));
        double result1;
        result1= calculator2.plus(4.1,(calculator2.plus(calculator2.multiple(15,7),calculator2.pow(
                calculator2.divide(28,5),2))));

        System.out.println("\n_____________________конструктор CalculatorWithMathCopy __________________________");
        System.out.println("через данный конструктор результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result1);
        System.out.println("Счетчик вызовов этого конструктора: "+calc.getCountOperation());


        CalculatorWithCounterAutoChoiceAgregation calc2=new CalculatorWithCounterAutoChoiceAgregation((calculator1));
        double result2;
        result2= calculator3.plus(4.1,(calculator3.plus(calculator3.multiple(15,7),calculator3.pow(
                calculator3.divide(28,5),2))));

        System.out.println("\n_____________________конструктор  CalculatorWithMathExtends__________________________");
        System.out.println("через данный конструктор результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result2);
        System.out.println("Счетчик вызовов этого конструктора: "+calc.getCountOperation());

    }
}
