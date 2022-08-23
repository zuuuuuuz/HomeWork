package Home_Work_3.calcs.additional;

import Home_Work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    /**
     * счётчик, отслеживающий количество вызовов методов данного класса
     */
    private long counterOperation;
    /**
     * Возведение дробного числа a в целую степень числа b используя билиотеку Math
     * @param a число
     * @param b степень
     * @return результат возведения первого числа в степень второго
     */
    public double pow(double a, int b) {
        counterOperation++;
        return Math.pow(a, b);
    }

    /**
     * Находит модуль числа a используя билиотеку Math
     * @param a число
     * @return модуль числа
     */
    public double module(double a) {
        counterOperation++;
        return Math.abs(a);
    }
    /**
     * Находит квадратный корень числа
     * @param a число
     * @return извлечение корня
     */
    public double sqrt(double a) {
        counterOperation++;
        return Math.sqrt(a);
    }
    /**
     * деления двух чисел
     * @param a делимое
     * @param b делитель
     * @return возвращает результат деления
     */
    public double divide(double a,double b){
        counterOperation++;
        double result;
        result=a/b;
        return result;
    }
    /**
     * Находит произведение двух чисел
     * @param a первое число
     * @param b второе число
     * @return возвращает произведение двух чисел
     */
    public double multiple(double a, double b){
        counterOperation++;
        double result;
        result = a*b;
        return result;
    }

    /**
     * вычитание двух чисел
     * @param a первое число
     * @param b второе число
     * @return возвращает результат вычитания
     */
    public double minus(double a,double b){
        counterOperation++;
        double result;
        result = a-b;
        return result;
    }
    /**
     * Производит сложение двух чисел
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public double plus(double a, double b){
        counterOperation++;
        double result;
        result = a+b;
        return result;
    }
    /**
     * Определяет, сколько раз были вызваны методы данного класса
     * @return количество вызовов методов
     */
    public long getCountOperation(){
        return counterOperation;
    }
}
