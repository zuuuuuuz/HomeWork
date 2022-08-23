package Home_Work_3.runners;

import Home_Work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc=new CalculatorWithMathCopy();
        double result;
        result= calc.plus(4.1,(calc.plus(calc.multiple(15,7),calc.pow(calc.divide(28,5),2))));
        System.out.println("Результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}

