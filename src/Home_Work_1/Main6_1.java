package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class Main6_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String nameUser;   //имя которое введет пользователь
        String nameVasya = "Вася";
        String nameAnastasia = "Анастасия";

        while (!console.hasNext("[а-яА-Я]+")) {  /*проверка на корректность ввода, если пользователь захочит
                                                            ввести числа цикл попросит еще раз ввести имя*/
            if (console.hasNextDouble()){
                System.out.println("Это не имя, как тебя зовут?");
            }
            console.next();
        }
        nameUser = console.nextLine();

        boolean theSame;
        theSame = Objects.equals(nameUser,nameVasya);
        if (theSame) {
            System.out.println("Привет!");       // если введенное имя = вася, вывести Привет! если не равно то сравнить
        } else theSame = Objects.equals(nameUser,nameAnastasia);               // с именем Анастасия

        if (theSame) {             //если введенное имя совпало хотя бы с одним из предложенных, то выведет Я тебя ждал
            System.out.println("Я тебя так долго ждал");
        } else System.out.println("Добрый день, а вы кто?");//если отличается от все предложенных
    }
}
