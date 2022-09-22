package Home_Work_1;

import java.util.Scanner;

public class Main4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float capacity; //количество байтов или килобайтов для перевода
        int byteOrKbyte; //выбор 10ичной или 2ичной сс

        System.out.println("Перевести в байты или килобайты?(1/2)");

        while (true) { /*проверка на корректность ввода, если будет введена буква,
                       символ или любое другое значение кроме 1 или 2 цикл попросит еще раз ввести значение*/
            try {
                byteOrKbyte = Integer.parseInt(console.nextLine());
                if (byteOrKbyte != 1 && byteOrKbyte != 2) {
                    throw new RuntimeException();
                }
                break;
            } catch (Exception e){
                System.out.println("Выбери 1 или 2\nПопробуй еще раз:");
            }
        }

        do {          /*проверка на корректность ввода, если будет введена буква или
                              символ или отрицательное число цикл попросит еще раз ввести значение*/
            System.out.println("Введите положительное число для перевода:");
            while (!console.hasNextFloat()) {
                System.out.println("Это не число!");
                console.next();
            }
            capacity = console.nextFloat();
        }while (capacity <=0);

        switch (byteOrKbyte){
            case 1:
                System.out.println(capacity*1024 +" байт");     //перевод в байты
                break;
            case 2:
                System.out.println(capacity/1024 +" килобайт"); //перевод в кбайты
                break;
            default:
                System.out.println("Некоректный ввод");
        }

    }
    public double toKbt(int byt){
        return byt / 1024d;
    }

    public int toByt(int kbt){
        return kbt * 1024;
    }
}
