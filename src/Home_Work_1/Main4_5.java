package Home_Work_1;

import java.util.Scanner;


public class Main4_5 {
    public String numberOrChar(int codeNumber) {
        Scanner console = new Scanner(System.in);
        String str= "";
        char value;     //интерпретация этого код-числа согласно кодировке
        value=(char)codeNumber;          //интерпретация этого код-числа согласно кодировке

        if(value>='A' && value<='Z'|| value>='a' && value<='z'){     //проверяем буква ли это
            str="это буква "+value;                  //если да, то вывыводим какая
        }else str="это не буква, а символ "+value;
        //если нет, то выводим какой это символ
        return str;
    }
}
