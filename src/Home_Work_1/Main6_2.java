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

        while (!console.hasNext("[а-яА-Я]+")) {/*проверка на корректность ввода, если пользователь захочит
                                                            ввести числа цикл попросит еще раз ввести имя*/
            if (console.hasNextDouble()){
                System.out.println("Это ведь не твое имя, как тебя зовут?");
            }
            console.next();
        }
        nameUser = console.nextLine();
        if (Objects.equals(nameUser,nameVasya)){     // если введенное имя = вася, вывести Привет!Я тебя так долго ждал
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (Objects.equals(nameUser,nameAnastasia)) {     //если введенное имя != вася, сравниваем с Анастасией
            System.out.println("Я тебя так долго ждал");      // если введенное имя = Анастасия, вывести Я тебя так долго ждал
        } else System.out.println("Добрый день, а вы кто?");  //если отличается от все предложенных
    }
}
