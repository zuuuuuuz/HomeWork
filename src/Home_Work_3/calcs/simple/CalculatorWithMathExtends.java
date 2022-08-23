package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Возведение первого числа в степень второго числа
     * @param a дробное число
     * @param b степень
     * @return результат возведения первого числа в степень второго
     */
    @Override

    public double pow(double a, int b) {
        return Math.pow(a, b);
    }

    /**
     * Находит модуль переданного числа
     * @param a число
     * @return модуль переданного числа
     */
    @Override
    public double module(double a) {
        return Math.abs(a);
    }

    /**
     * Находит квадратный корень из числа
     * @param a число
     * @return результат извлечения корня из числа
     */
    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
