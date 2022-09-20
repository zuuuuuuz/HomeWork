package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class Updated_6_2 implements ICommunicationPrinter {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        String name=" ";   //имя которое введет пользователь

        boolean a = true;
        InputCheckRus check = new InputCheckRus();
        Scanner console = new Scanner(System.in);
        while (a){
            try {
                name = console.nextLine();
                if (!check.inputCheckRusString(name)) {
                    throw new RuntimeException();
                }
                break;

            } catch (Exception e){
                System.out.println("Некорректный ввод, Попробуй еще раз: ");
            }
        }
        ICommunicationPrinter hello=new Updated_6_2();
        System.out.println(hello.welcom(name));

    }
    public String welcom(String name){
        String str = " ";
        String nameVasya = "Вася";
        String nameAnastasia = "Анастасия";
        if (Objects.equals(name,nameVasya)){
            return str = "Привет!\nЯ тебя так долго ждал ";
        }else if (Objects.equals(name,nameAnastasia)){
            return str = "Я тебя так долго ждал ";
        }else return str = "Добрый день, а вы кто?";
    }
}
