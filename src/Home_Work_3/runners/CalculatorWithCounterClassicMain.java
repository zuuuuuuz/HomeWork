package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
        public static void main(String[] args) {
            CalculatorWithCounterClassic calc=new CalculatorWithCounterClassic();
            // 4.1 + 15 * 7 + ( 28 / 5 ) ^ 2
            double result =calc.divide(28,5);
            calc.incrementCountOperation();

            result=calc.pow(result,2);
            calc.incrementCountOperation();

            double result1 =calc.multiple(15,7);
            calc.incrementCountOperation();

            result = calc.plus(result,result1);
            calc.incrementCountOperation();

            result= calc.plus(4.1,result);
            calc.incrementCountOperation();

            System.out.println("Результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
            System.out.println("Счетчик: "+calc.getCountOperation());

        }
}
