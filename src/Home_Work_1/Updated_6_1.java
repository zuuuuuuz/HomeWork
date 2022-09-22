package Home_Work_1;

import java.util.Objects;
import java.util.Scanner;

public class Updated_6_1 implements ICommunicationPrinter{

    public String welcom(String name){
        String str = " ";
        String nameVasya = "Вася";
        String nameAnastasia = "Анастасия";
        if (Objects.equals(name,nameVasya)){
            return str = "Привет!\nЯ тебя так долго ждал ";
        }else
            if (Objects.equals(name,nameAnastasia)){
            return str = "Я тебя так долго ждал ";
        }else return str = "Добрый день, а вы кто?";
    }
}



