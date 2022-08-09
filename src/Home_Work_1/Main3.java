package Home_Work_1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-100));      // 100
        System.out.println(Math.abs(-35.8d));    // 35.8
        System.out.println(Math.abs(784532L));   // 784532
        System.out.println(Math.abs(45.341f));   // 45.341
        //перевод радианов в градусы и градусов в радианы:
        System.out.println(Math.sin(Math.toRadians(30)));//0.49999999999999994
        System.out.println(Math.cos(Math.toRadians(90)));//6.123233995736766E-17
        //Возведение в степень
        System.out.println(Math.pow(2, 2)); // 4.0
        System.out.println(Math.pow(3, 3)); // 9.0
        //Извлечение корней
        System.out.println(Math.sqrt(16));  // 4.0
        System.out.println(Math.cbrt(8));   // 2.0
        //Генерация 2 случайных чисел
        for (int i=0;i<2;i++){
            System.out.println(Math.random());
        }
        double random1 = Math.random();
        double random2 = Math.random();
        double max = Math.max(random1,random2);
        double min = Math.min(random1,random2);
        System.out.println("Наибольшее число: "+max+" Наименьшее число: "+min);

        //округление
        System.out.println(Math.round(2.6)); // 3 привычное округление
        System.out.println(Math.floor(2.6)); // 2.0 округление в меньшую сторону
        System.out.println(Math.ceil(2.3)); // 3.0 округление в большую сторону

        System.out.println(Math.min(27,65));//27 Returns the smaller of two values
        System.out.println(Math.max(27,65));//65 Returns the greater of two values

        //Returns sqrt(x2 +y2) without intermediate overflow or underflow.
        System.out.println(Math.hypot(2.7,4)); //4.825971404805461

        System.out.println(Math.floorDiv(1, 2)); // 0 возвращает целочисленный результат деления a на b
        System.out.println(Math.floorDiv(7, 2)); // 3
        System.out.println(Math.floorDiv(9, 2)); // 4

        System.out.println(Math.floor(456.5698785));  //456.0 возвращает наибольшее целое число, которое не больше a
        //возвращает число 1, если число value положительное, и -1, если значение value отрицательное. Если value равно 0, то возвращает 0
        System.out.println(Math.signum(12632.2222));//1
        System.out.println(Math.signum(-32.3/3.111));//-1
        System.out.println(Math.signum(1.2*0));//0

        System.out.println("Введите число");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        if (Math.signum(a)>=0) {
            System.out.println("число положительное");
        }else System.out.println("число отрицательное");
    }
}