package Home_Work_3.calcs.simple;

import Home_Work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    /**
     * счётчик, отслеживающий количество вызовов методов данного класса
     */
    private long counter;
    /**
     * Вычисляет частное от деления двух чисел
     * @param a делимое
     * @param b делитель
     * @return возвращает результат деления a на b
     */
    public double divide(double a,double b){
        counter++;
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
        counter++;
        double result;
        result = a*b;
        return result;
    }
    /**
     * Выполняет вычитание двух чисел
     * @param a первое число
     * @param b второе число
     * @return возвращает результат вычитания двух чисел
     */
    public double minus(double a,double b){
        counter++;
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
        counter++;
        double result;
        result = a+b;
        return result;
    }

    /**
     * Возведение первого числа в степень второго числа
     * @param a дробное число
     * @param b степень
     * @return результат возведения первого числа в степень второго
     */
    public double pow(double a, int b){
        counter++;
        return Math.pow(a,b);
    }
    /**
     * Находит модуль переданного числа
     * @param a число
     * @return модуль переданного числа
     */
    public double module(double a){
        counter++;
        return Math.abs(a);
    }

    /**
     * Находит квадратный корень из числа
     * @param a число
     * @return результат извлечения корня из числа
     */
    public double sqrt(double a){
        counter++;
        return Math.sqrt(a);
    }
    /**
     * Определяет количество вызовов методов данного класса
     * @return количество
     */
    public long getCountOperation(){
        return counter;
    }
}

