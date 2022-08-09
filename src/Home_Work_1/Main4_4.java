package Home_Work_1;

import java.util.Scanner;

public class Main4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float capacity;
        int byteOrKbyte;

        System.out.println("Перевести в байты или килобайты?(1/2)");

        while (true) {

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

        do {
            System.out.println("Введите положительное число для перевода:");
            while (!console.hasNextFloat()) {
                System.out.println("Это не число!");
                console.next();
            }
            capacity = console.nextFloat();
        }while (capacity <=0);

        switch (byteOrKbyte){
            case 1:
                System.out.println(capacity*1024 +" байт");
                break;
            case 2:
                System.out.println(capacity/1024 +" килобайт");
                break;
            default:
                System.out.println("Некоректный ввод");
        }
    }
}
