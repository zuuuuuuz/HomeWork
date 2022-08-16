package Home_Work_2.arrays;
import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation {
    public static void main(String[] args){
        DoWhileOperation container = new DoWhileOperation();
        int[] arr=arrayFromConsole();
        container.arraysElements(arr);
        container.everySecondElement(arr);
        container.arrayReversive(arr);
    }

    @Override
    public void arraysElements(int[] arr) {
        //Перебор массива через цикл do...while
        int i = 0;
        System.out.println("Перебор массива через цикл do...while: ");
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {
        //Каждый второй элемент массива через цикл do...while
        int i = 1;
        System.out.println("Каждый второй элемент массива через цикл do...while: ");
        do {
            System.out.print(arr[i] + " ");
            i+=2;
        } while (i < arr.length);
        System.out.println();
    }

    @Override
    public void arrayReversive(int[] arr) {
        //Вывести все элементы массива в обратном порядке через цикл do...while
        int i = arr.length-1;
        System.out.println("все элементы массива в обратном порядке через цикл do...while: ");
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 0);
        System.out.println();
    }
}
