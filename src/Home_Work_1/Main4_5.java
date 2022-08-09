package Home_Work_1;

import java.util.Scanner;


public class Main4_5 {
    public static void main(String[] args) throws java.io.IOException{
        Scanner console = new Scanner(System.in);
        System.out.println("введите код-число");
        int codeNumber; //код-число
        char value;     //интерпретация этого код-числа согласно кодировке

        while (!console.hasNextInt()) { /*проверка на корректность ввода, если будет введена буква,
                       символ или не целое цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()){
                System.out.println("Число должно быть целым!");
            }else System.out.println("Это не число!");
            console.next();
        }
        codeNumber = console.nextInt();  //код-число
        value=(char)codeNumber;          //интерпретация этого код-числа согласно кодировке

        if(value>='A' && value<='Z'|| value>='a' && value<='z'){     //проверяем буква ли это
            System.out.println("это буква "+value);                  //если да, то вывыводим какая
        }else System.out.println("это не буква, а символ "+value);   //если нет, то выводим какой это символ
    }
}
