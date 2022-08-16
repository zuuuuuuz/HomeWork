package Home_Work_2.arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation{
    public static void main(String[] args){
        ForOperation array = new ForOperation();
        int[] arr = arrayFromConsole();
        array.arraysElements(arr);
        array.everySecondElement(arr);
        array.arrayReversive(arr);
    }

    @Override
    public void arraysElements(int[] arr) {
        //Перебор массива через цикл for
        System.out.print("Перебор массива через цикл for имеет вид: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    @Override
    public void everySecondElement(int[] arr) {
        //Каждый второй элемент массива через цикл for
        System.out.print("Каждый второй элемент массива через цикл for имеет вид: ");
        for (int i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    @Override
    public void arrayReversive(int[] arr) {
        //Вывести все элементы массива в обратном порядке через цикл for
        System.out.print("Массив в обратном порядке через цикл for имеет вид: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
