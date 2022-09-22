package Home_Work_3.calcs.additional;

public class CalculatorWithMathExtends extends Home_Work_3.calcs.simple.CalculatorWithMathExtends {
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
        return super.pow(a, b);
    }

    /**
     * Находит модуль числа a используя билиотеку Math
     * @param a число
     * @return модуль числа
     */
    public double module(double a) {
        counterOperation++;
        return super.module(a);
    }
    /**
     * Находит квадратный корень числа
     * @param a число
     * @return извлечение корня
     */
    public double sqrt(double a) {
        counterOperation++;
        return super.sqrt(a);
    }
    /**
     * деления двух чисел
     * @param a делимое
     * @param b делитель
     * @return возвращает результат деления
     */
    public double divide(double a,double b){
        counterOperation++;
       
        return super.divide(a,b);
    }
    /**
     * Находит произведение двух чисел
     * @param a первое число
     * @param b второе число
     * @return возвращает произведение двух чисел
     */
    public double multiple(double a, double b){
        counterOperation++;
     
        return super.multiple(a,b);
    }

    /**
     * вычитание двух чисел
     * @param a первое число
     * @param b второе число
     * @return возвращает результат вычитания
     */
    public double minus(double a,double b){
        counterOperation++;
        
        return super.minus(a,b);
    }
    /**
     * Производит сложение двух чисел
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public double plus(double a, double b){
        counterOperation++;
      
        return super.plus(a,b);
    }
    /**
     * Определяет, сколько раз были вызваны методы данного класса
     * @return количество вызовов методов
     */
    public long getCountOperation(){
        return counterOperation;
    }
}
