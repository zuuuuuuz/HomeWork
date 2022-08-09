package Home_Work_1;

import java.util.Scanner;


public class Main4_5 {
    public static void main(String[] args) throws java.io.IOException{
        Scanner console = new Scanner(System.in);
        System.out.println("введите код-число");
        int codeNumber;
        char value;

        while (!console.hasNextInt()) {
            if (console.hasNextDouble()){
                System.out.println("Число должно быть целым!");
            }else System.out.println("Это не число!");
            console.next();
        }
        codeNumber = console.nextInt();
        value=(char)codeNumber;

        if(value>='A' && value<='Z'|| value>='a' && value<='z'){
            System.out.println("это буква "+value);
        }else System.out.println("это не буква, а символ "+value);
    }
}
