package Home_Work_1;

import java.util.Scanner;

public class Updated_6_3 implements ICommunicationPrinter{

    public String welcom(String name){
        String str = " ";
        switch (name){
            case "Вася":       // если введенное имя = вася, вывести Привет!Я тебя так долго ждал
                str="Привет!\nЯ тебя так долго ждал";
                break;
            case "Анастасия":  // если введенное имя = Анастасия, вывести Я тебя так долго ждал
                str="Я тебя так долго ждал";
                break;
            default:           //если имя != Вася и !=Анастасия
                str="Добрый день, а вы кто?";
        }
        return str;
    }

}
