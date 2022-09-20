package Home_Work_2.loops;

public class Main_1_1_1 {

    public int factorial (int number){
        int result =1;
        if(inputCheck(number)){
            for (int i = 2 ; i <= number ; i++){
               result *= i;
            }
        }
        return result;
    }
    /**
     * Метод inputCheck проверяет вводимые данные
     * @param a Строка
     * @return true - проверку прошло; false -  проверку не прошло.
     */
    public boolean inputCheck(int a){
        if (a>=0 && a<=20) {
            return true;
        }else return false;
    }
    public static long recursion(int number) {
        if (number == 1) {
            return 1;
        }
        return  (number * recursion((number-1))) ;
    }
}

