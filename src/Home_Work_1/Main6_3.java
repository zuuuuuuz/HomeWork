package Home_Work_1;

import java.util.Scanner;

public class Main6_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String nameUser;
        String nameVasya = "Вася";
        String nameAnastasia = "Анастасия";

        while (!console.hasNext("[а-яА-Я]+")) {
            if (console.hasNextDouble()){
                System.out.println("Это ведь не твое имя, как тебя зовут?");
            }
            console.next();
        }
        nameUser = console.nextLine();
        switch (nameUser){
            case "Вася":
                System.out.println("Привет!\nЯ так долго тебя ждал");
                break;
            case "Анастасия":
                System.out.println("Я так долго тебя ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");

        }
    }
}
