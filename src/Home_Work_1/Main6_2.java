package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class Main6_2 {
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
        if (Objects.equals(nameUser,nameVasya)){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (Objects.equals(nameUser,nameAnastasia)) {
            System.out.println("Я тебя так долго ждал");
        } else System.out.println("Добрый день, а вы кто?");
    }
}
