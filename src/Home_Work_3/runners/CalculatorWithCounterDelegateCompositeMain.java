package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc=new CalculatorWithCounterAutoComposite();
        // 4.1 + 15 * 7 + ( 28 / 5 ) ^ 2
        double result;
        result= calc.plus(4.1,(calc.plus(calc.multiple(15,7),calc.pow(calc.divide(28,5),2))));

        System.out.println("Результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Счетчик вызовов: "+calc.getCounter());
    }
}
