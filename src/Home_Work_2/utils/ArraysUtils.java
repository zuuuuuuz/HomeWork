package Home_Work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    /**
     * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
     * @return созданный массив
     */
    public static int[] arrayFromConsole (){
        System.out.println("Введите размер массива");
        Scanner console = new Scanner(System.in);
        while (!console.hasNextInt()) { /*проверка на корректность ввода, если будет введена буква, символ или
                                                             не целое число цикл попросит еще раз ввести значение*/
            if (console.hasNextDouble()) {
                System.out.println("Число должно быть целым! ");
            } else System.out.println("Это не число! ");
            console.next();
        }
        int size = console.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите элемент массива: ");
            array[i] = console.nextInt();
        }
        return array;
    }
    /**
     * Данный метод принимает два аргумента. Первый (size) указывает размер массива.
     * Второй (maxValueExclusion) указывает максимальное число до которого генерируются числа.
     * @param size
     * @param maxValueExclusion
     * @return Созданный массив.
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0;i<array.length;i++){
            array[i]=(int)(rand.nextInt(maxValueExclusion));
            }
        return array;
    }

}
