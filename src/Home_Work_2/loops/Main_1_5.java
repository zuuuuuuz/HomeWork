package Home_Work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Main_1_5 {
    /**
     * Метод maxNumber находит наибольшую цифру натурального числа.
     * @param c
     * @return max
     */
    public static long maxNumber(long c) {
        long max = 0;//max number
        while (c > 0) {
            if (c % 10 > max) {
                max = c % 10;
            }
            c = c / 10;
        } return max;
    }
    /**
     * Метод вычисляет вероятность четных случайных чисел.
     * @param y
     * @return veroyatnost
     */
    public static double veroyatnosti(int y){
        int array[]= new int[y];
        double schetchik=0;
        double veroyatnost;
        Random rand = new Random();
        for (int i = 0;i<array.length;i++){
            array[i]= rand.nextInt(100);
        }

        for (int i = 0;i<array.length;i++){
            int element = array[i];
            if (element%2==0){
                ++schetchik;
            }
        }veroyatnost=(schetchik/y)*100;
        return veroyatnost;
    }
    /**
     * Метод считает четные и нечетные цифры числа.
     * @param a
     */
    public static String summatorOfEvenAndOdd(long a){
        String result;
        long number=a;
        int even=0;
        int odd=0;
        while (a>0){
            if (a%2==0){
                even=++even;
            }else odd=++odd;
            a=a/10;
        }
        return result="В числе "+number+" находится "+even+" четных цифр и "+odd+" нечетных";
    }
    /**
     * Метод выводит ряд Фибоначчи.
     * @param q -количество элементов.
     * @return
     */
    public static String fibonachi(long q){
        long q1=1;
        long q2=2;
        long b=0;
        String str="";
        for (int i=1;i<q;i++){
            //long v=(q1+q2);
            if (i==1){
                System.out.print("Последовательность Фибоначчи: "+q1+"  ");
            }else if(i==2){
                System.out.print(q2+" ");
            }else if(i!=1||i!=2) {
                System.out.printf(" %d ", q1 + q2);
                b = q1;
                q1 = q2;
                q2 = q1 + b;
            }

        }return str="";
    }
    /**
     *Метод выводит ряд чисел в диапазоне с шагом.
     * @param min - нижний предел
     * @param max - верхний предел
     * @param step - шаг
     * @return
     */
    public static String stepByStep(float min, float max, float step){
        System.out.print("От числа "+min+" до числа "+max+" с шагом в "+step+" =");
        String str2;
        for (int i=0;min<max;i++){
            System.out.print(" "+min);
            min= min+step;
        }
        System.out.print(" "+max);
        return str2="";
    }
    /**
     * Метод переворачивает число.
     * @param number
     * @return
     */
    public static String perevorot(int number){
        int m=0;
        String str4;
        while (number>0){
            m=m*10+number%10;
            number=number/10;
        }
        System.out.println(m);
        return str4="";
    }
}
