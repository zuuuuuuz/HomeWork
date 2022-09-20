package Home_Work_1;

import java.util.Scanner;

public class Updated_6_3 implements ICommunicationPrinter{
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
        ICommunicationPrinter hello=new Updated_6_3();
        System.out.println(hello.welcom(name));

    }
    public String welcom(String name){
        String str = " ";
        String nameVasya = "Вася";
        String nameAnastasia = "Анастасия";
        switch (name){
            case "Вася":       // если введенное имя = вася, вывести Привет!Я тебя так долго ждал
                str="Привет!\nЯ так долго тебя ждал";
                break;
            case "Анастасия":  // если введенное имя = Анастасия, вывести Я тебя так долго ждал
                str="Я так долго тебя ждал";
                break;
            default:           //если имя != Вася и !=Анастасия
                str="Добрый день, а вы кто?";
        }
        return str;
    }

}
