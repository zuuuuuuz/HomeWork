package Home_Work_1;

import java.util.Scanner;

public class Main4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number;                                //переменная для числа
        System.out.println("Введите число");

        while (!console.hasNextLong()) { /*проверка на корректность ввода, если будет введена буква, символ или
                                                             не целое число цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()){
                System.out.println("Число должно быть целым!");
            }else System.out.println("Это не число!");
            console.next();
        }
        number = console.nextLong();
        if(number%2==0){             //если не будет остатка = число четное, если != то нечетное
            System.out.println("Число является четным");
        }else System.out.println("Число является нечетным");
    }
    public boolean evenOrOdd(long number){
        return number % 2 == 0;
    }
}