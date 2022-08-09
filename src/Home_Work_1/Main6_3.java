package Home_Work_1;

import java.util.Scanner;

public class Main6_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String nameUser;
        String nameVasya = "Вася";
        String nameAnastasia = "Анастасия";

        while (!console.hasNext("[а-яА-Я]+")) {   /*проверка на корректность ввода, если пользователь захочит
                                                            ввести числа цикл попросит еще раз ввести имя*/
            if (console.hasNextDouble()){
                System.out.println("Это ведь не твое имя, как тебя зовут?");
            }
            console.next();
        }
        nameUser = console.nextLine();
        switch (nameUser){
            case "Вася":       // если введенное имя = вася, вывести Привет!Я тебя так долго ждал
                System.out.println("Привет!\nЯ так долго тебя ждал");
                break;
            case "Анастасия":  // если введенное имя = Анастасия, вывести Я тебя так долго ждал
                System.out.println("Я так долго тебя ждал");
                break;
            default:           //если имя != Вася и !=Анастасия
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
