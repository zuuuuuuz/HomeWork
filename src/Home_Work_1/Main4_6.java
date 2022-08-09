package Home_Work_1;

import java.util.Scanner;

public class Main4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year; //переменная год
        do {
            System.out.println("Введите год:");
            while (!console.hasNextInt()) {   /*проверка на корректность ввода, если будет введена буква или
                                            символ или отрицательное число цикл попросит еще раз ввести значение*/
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
/*
Если год не делится на 4, значит он обычный
Иначе надо проверить не делится ли год на 100
Если не делится, значит это не столетие и можно сделать вывод, что год високосный
Если делится на 100, значит это столетие и его следует проверить его делимость на 400
Если год делится на 400, то он високосный
Иначе год обычный
 */