package Home_Work_1;

import java.util.Scanner;

public class Main4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year;
        do {
            System.out.println("Введите год:");
            while (!console.hasNextInt()) {
                System.out.println("Некорректный ввод, попробуй еще раз:");
                console.next();
            }
            year = console.nextInt();
        }while (year <=0);

        if(year%4!=0){
            System.out.println("Год не високосный");
        } else if (year%100==0) {
            if (year%400==0){
                System.out.println("Год високосный");
            }
            System.out.println("Год не високосный");
        } else System.out.println("Год високосный");
    }
}
