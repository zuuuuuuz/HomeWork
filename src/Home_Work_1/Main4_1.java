package Home_Work_1;

import java.util.Scanner;

public class Main4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number;
        System.out.println("Введите число");

        while (!console.hasNextLong()) {
            if (console.hasNextDouble()){
                System.out.println("Число должно быть целым!");
            }else System.out.println("Это не число!");
            console.next();
        }
        number = console.nextLong();
        if(number%2==0){
            System.out.println("Число является четным");
        }else System.out.println("Число является нечетным");
    }
}
