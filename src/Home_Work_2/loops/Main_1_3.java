package Home_Work_2.loops;

import java.io.Console;
import java.util.Scanner;

public class Main_1_3 {
    /**
     * Метод pow1 возводит число в степень.
     * @param a число
     * @param b степень
     * @return результат возведения
     */
    public static double pow1(double a, long b){
        double resultat=1;
        for (int i = 1; i<=b ;i++){
             resultat *=a;
        }
        return resultat;
    }
    /**
     * Метод inputCheck проверяет вводимые данные
     * @param a Строка
     * @return true - проверку прошло; false -  проверку не прошло.
     */
    public static boolean inputCheck(String a,String b){
        try {
            Double d = Double.parseDouble(a);
            Long l = Long.parseLong(b);
            if (l<0){
                throw new RuntimeException();
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
