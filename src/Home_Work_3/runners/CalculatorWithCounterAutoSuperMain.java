package Home_Work_3.runners;

import Home_Work_3.calcs.additional.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc=new CalculatorWithMathExtends();
        // 4.1 + 15 * 7 + ( 28 / 5 ) ^ 2
        double result =calc.divide(28,5);

        result=calc.pow(result,2);

        double result1 =calc.multiple(15,7);

        result = calc.plus(result,result1);

        result= calc.plus(4.1,result);


        System.out.println("Результат выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Счетчик вызовов: "+calc.getCountOperation());
    }
}
