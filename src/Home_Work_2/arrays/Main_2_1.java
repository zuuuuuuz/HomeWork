package Home_Work_2.arrays;
import java.util.Scanner;
import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;
import static Home_Work_2.utils.ArraysUtils.arrayRandom;

public class Main_2_1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int[] container = arrayFromConsole();
        for(int i = 0; i < container.length; i++){
            System.out.print(container[i] + " ");
        }
        System.out.println();

        System.out.println("Введите размер массива, для заполнения его случайными элементами: ");
        while (!console.hasNextInt()) { /*проверка на корректность ввода, если будет введена буква,
                       символ или не целое цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()) {
                System.out.println("Число должно быть целым!");
            } else System.out.println("Это не число!");
            console.next();
        }
        int length = console.nextInt();

        System.out.println("Укажите до какого числа генерировать случайные числа: ");
        while (!console.hasNextInt()) { /*проверка на корректность ввода, если будет введена буква,
                      символ или не целое цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()) {
                System.out.println("Число должно быть целым!");
            } else System.out.println("Это не число!");
            console.next();
        }
        int maxRand = console.nextInt();
        int[] containerRand = arrayRandom(length, maxRand);
        for(int i = 0; i < containerRand.length; i++) {
            System.out.print(containerRand[i] + " ");
        }
    }
}