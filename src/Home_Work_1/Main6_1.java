package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class Main6_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String nameUser;
        String nameVasya = "Вася";
        String nameAnastasia = "Анастасия";

        while (!console.hasNext("[а-яА-Я]+")) {
            if (console.hasNextDouble()){
                System.out.println("Это не имя, как тебя зовут?");
            }
            console.next();
        }
        nameUser = console.nextLine();

        boolean theSame;
        theSame = Objects.equals(nameUser,nameVasya);
        if (theSame) {
            System.out.println("Привет!");
        } else theSame = Objects.equals(nameUser,nameAnastasia);

        if (theSame) {
            System.out.println("Я тебя так долго ждал");
        } else System.out.println("Добрый день, а вы кто?");
    }
}
