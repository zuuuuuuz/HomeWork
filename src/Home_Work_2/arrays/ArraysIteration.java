package Home_Work_2.arrays;
import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    /**
     * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит все элементы
     * массива в консоль
     */
    public static void arraysElements() {
        int[] arr = arrayFromConsole();
        System.out.println(arr);
        //Перебор массива через цикл do...while
        int i = 0;
        System.out.println("Перебор массива через цикл do...while: ");
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);
        System.out.println();

        //перебор массива через цикл while
        System.out.println("Перебор массива через цикл while:");
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        //Перебор массива через цикл for
        System.out.println("Перебор массива через цикл for:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Перебор массива через цикл foreach
        System.out.println("Перебор массива через цикл foreach:");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    /**
     * * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит каждый второй элемент
     * массива в консоль,за исключением цикла foreach (c ним нельзя сделать т.к. foreach обрабатывает все элементы)
    */
    public static void everySecondElements() {
        int[] arr = arrayFromConsole();

        //Каждый второй элемент массива через цикл do...while
        int i = 1;
        System.out.println("Каждый второй элемент массива через цикл do...while: ");
        do {
            System.out.print(arr[i] + " ");
            i+=2;
        } while (i < arr.length);
        System.out.println();

        //Каждый второй элемент массива через цикл while
        System.out.println("Каждый второй элемент массива через цикл while:");
        i = 1;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i+=2;
        }
        System.out.println();

        //Каждый второй элемент массива через цикл for
        System.out.println("Каждый второй элемент массива через цикл for:");
        for (i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Каждый второй элемент массива c foreach нельзя сделать т.к. foreach обрабатывает все элементы
        System.out.print("Каждый второй элемент массива через цикл foreach: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    /**
     * метод вызывает метод arrayFromConsole, что бы получить массив, и выводит все элементы
     * массива в обратном порядке в консоль, за исключением цикла foreach (c ним нельзя сделать т.к. foreach
     * обрабатывает все элементы oт начала до последнего элемента!
     */
    public static void arrayReversive(){
        int[] arr = arrayFromConsole();{

        }
        //Вывести все элементы массива в обратном порядке через цикл do...while
        int i = arr.length-1;
        System.out.println("все элементы массива в обратном порядке через цикл do...while: ");
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();

        //Вывести все элементы массива в обратном порядке через цикл while
        System.out.println("все элементы массива в обратном порядке через цикл while:");
        i = arr.length-1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println();

        //Вывести все элементы массива в обратном порядке через цикл for
        System.out.println("все элементы массива в обратном порядке через цикл for:");
        for (i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Вывести все элементы массива в обратном порядке c foreach нельзя сделать т.к. foreac обрабатывает все элементы oт начала до последнего элемента!
        System.out.print("Массив в обратном порядке через цикл foreach: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        }

}
