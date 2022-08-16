package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation{
    public static void main(String[] args){
        WhileOperation array = new WhileOperation();
        int[] arr = arrayFromConsole();
        array.arraysElements(arr);
        array.everySecondElement(arr);
        array.arrayReversive(arr);
    }

    @Override
    public void arraysElements(int[] arr) {
        //перебор массива через цикл while
        System.out.println("Перебор массива через цикл while:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void everySecondElement(int[] arr) {
        //Каждый второй элемент массива через цикл while
        System.out.println("Каждый второй элемент массива через цикл while:");
        int i = 1;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i+=2;
        }
        System.out.println();
    }

    @Override
    public void arrayReversive(int[] arr) {
        //Вывести все элементы массива в обратном порядке через цикл while
        System.out.println("все элементы массива в обратном порядке через цикл while:");
        int i = arr.length-1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println();
    }
}