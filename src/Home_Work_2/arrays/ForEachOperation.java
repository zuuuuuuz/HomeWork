package Home_Work_2.arrays;

import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayFromConsole;

public class ForEachOperation implements IArraysOperation{
    public static void main(String[] args){
        ForEachOperation array = new ForEachOperation();
        int[] arr = arrayFromConsole();
        array.arraysElements(arr);
        array.everySecondElement(arr);
        array.arrayReversive(arr);
    }

    @Override
    public String arraysElements(int[] arr) {
        //System.out.print("Перебор массива через цикл foreach: ");
        String str="Перебор массива через цикл foreach: ";
        for (int element : arr) {
            str+=(element + " ");
        }
        return str;
    }

    @Override
    public int[] everySecondElement(int[] arr) {
       // System.out.print("Каждый второй элемент массива через цикл foreach: ");
        int[] str = new int[0];
        int i = 0, j = 0;
        for (int element : arr) {
            i++;
            if(i % 2 == 0){


                str = Arrays.copyOf(str, str.length + 1);
                str[j] = arr[i - 1];


                j++;
            }
            if(i == arr.length){
                break;
            }
        }
        return str;
    }

    @Override
    public int[] arrayReversive(int[] arr) {
        //System.out.print("Массив в обратном порядке через цикл foreach: ");
        int[] str=new int[arr.length];
        int i =arr.length -1;
        for (int element : arr) {
            str[i]=element;
            i--;
        }
        return str;
    }
}