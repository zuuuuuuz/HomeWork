package Home_Work_2.arrays;
import java.util.Arrays;

import static Home_Work_2.utils.ArraysUtils.arrayRandom;

public class Main_2_4 {
    public static void main(String[] args) {
        int result1,result2,result3,result4;

        int[] arr=arrayRandom(50,100);
        System.out.println(Arrays.toString(arr));

        result1=Main_2_4_1(arr);
        System.out.println("Сумма четных положительных элементов массива: "+result1);

        result2 = Main_2_4_2(arr);
        System.out.println("Максимальный из элементов массива с четными индексами: "+result2);
        Main_2_4_3(arr);
        Main_2_4_4(arr);
        System.out.println("Сжатый массив, удалив элементы, принадлежащие заданному интервалу(от 0 до 100):");
        Main_2_4_5(arr,0,100);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = arrayRandom(50,100);
        int q = Main_2_4_6(arr1);
        System.out.print("Сумма цифр массива: "+q);


    }

    /**
     * Сумма четных положительных элементов массива
     * @param array
     * @return result
     */
    public static int Main_2_4_1(int[] array) {
        int result=0;
        for (int i=0;i< array.length;i++){
            if (array[i]>0 && array[i]%2==0){
                result+=array[i];
            }

        }
        return result;
    }
    /**
     * Максимальный из элементов массива с четными индексами
     * @param array
     * @return result
     */
    public static int Main_2_4_2(int[] array){
        int result=0;
        for (int i=1; i<array.length;i+=2){
            if (array[i]>result){
                result = array[i];
            }
        }
        return result;
    }
    /**
     * Элементы массива, которые меньше среднего арифметического
     *
     * @param array
     * @return
     */
    public static int[] Main_2_4_3(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        int[] result = new int[0];
        int j = 0;
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        double srednee = sum / arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < srednee){
                j++;
                result = Arrays.copyOf(result, j);
                result[j-1] = arr[i];
            }
        }
        return result;
    }
    /**
     * Найти два наименьших (минимальных) элемента массива
     *
     * @param array
     * @return
     */
    public static int[] Main_2_4_4(int[] array){
        int min = 2147483647;
        int min2 =min;
        System.out.println();
        for (int i = 0;i<array.length;i++){
            if(array[i]< min){
                min2 = min;
                min = array[i];
            }else if (array[i]<min2) {
                min2 =array[i];
            }
        }
        int[] result = new int[2];
        result[0]=min;
        result[1]=min2;
        //System.out.println("два наименьших (минимальных) элемента массива "+min+" "+min2);
        return result;
    }
    /**
     * Сжать массив, удалив элементы, принадлежащие интервалу
     * @param array
     * @param min
     * @param max
     * @return
     */
    public static int[] Main_2_4_5(int[] array, int min, int max){
        int[] arr = Arrays.copyOf(array,array.length);

        int i = 0;

        while( i < arr.length){



            if(min <= arr[i] && arr[i] <= max){
                int j = i;

                while (j < arr.length - 1){
                    arr[j] = arr[j + 1];
                    j++;



                }
                arr[arr.length - 1] = 0;
            } else {
                i++;
            }
        }

        return arr;
    }

    /**
     * Метод считает сумма цифр массива
     * @param array
     * @return result
     */
    public static int Main_2_4_6(int[] array){
        int result = 0;
        for (int i =0;i<array.length;i++){
            while (!(array[i]==0)){
                result += array[i]%10;
                array[i]/=10;
            }
        }
        return result;
    }

}
