package Home_Work_4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class DataContainer<T>{
    public T[] data;
    public T item;

    public DataContainer(T[] data){
        this.data=data;
    }

    public int add(T item){
        int index;
        if (item == null) {
            return index = -1;
        }
        for (int i=0;i<this.data.length;i++){
            if(data[i] == null) {
                data[i] = item;
                return index= i;
            }
        }
        data = Arrays.copyOf(data,data.length+1);
        data[data.length-1]=item;
        return data.length-1;
    }

    public T get(int index){
        if (index < data.length) {
            return data[index];
        }else return null;
    }

    public T[] getItems(){
        return data;
    }
    public boolean delete(int index) {
        if (index > data.length - 1) {
            return false;
        } else if (data[index] == null) {
            return false;
        }
        if (index == data.length-1){
            T[] data = Arrays.copyOf(this.data, index);
            this.data = data;
        }
        for (int i = index; i < data.length - 1; i++) {
            T a = data[i];
            data[i] = data[i + 1];
            data[i + 1] = a;
            if (i + 1 == data.length - 1) {
                T[] data = Arrays.copyOf(this.data, i + 1);
                this.data = data;
            }
        }
        return true;
    }

    public boolean delete(T item){
        boolean flag=false;
        boolean result=false;
        if (item != null){
            do {
                for (int i=0;i< data.length;i++){
                    if (Objects.equals(item,data[i])){
                        if (i==data.length-1){
                            T[] data = Arrays.copyOf(this.data, this.data.length - 1);
                            this.data = data;
                            result = true;
                            flag = true;
                        }else {
                            T a = data[i];
                            data[i] = data[i + 1];
                            data[i + 1] = a;
                        }
                    } else flag = false;
                }
            }while (flag);
        }
        return result;
    }
    //9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО
    //  объекта comparator. Классом Arrays пользоваться запрещено. Интефейс Comparator обязательно должен быть реализован отдельным классом.
    public void sort(Comparator<T> comparator){
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare( data[i],  data[j]) > 0) {
                    T a =  data[i];
                    data[i] = data[j];
                    data[j] = a;
                }
            }
        }
    }

    public String toString() {
        String str = " [ ";
        for (int i = 0; i < data.length; i++) {
            if (i == 0 ){
                if (data[i] != null){
                    str += data[i] ;
                }else{
                    for (int j = i;j<data.length;j++){
                        if (data[j] != null){
                            str += data[j];
                            break;
                        }
                    }
                }
            }else if (data[i] != null) {
                str += "   "+data[i] ;
            }
        }
        str +=" ] ";
        return str;
    }

    public static void sort(DataContainer<? extends Comparable> container){
        Comparable[] arr = container.getItems();
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {

                    Comparable a =  arr[i];

                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
    }
     public static <Comparable> void sort(DataContainer<? extends Comparable> container, Comparator<Comparable> comp){
        Comparable[] arr = container.getItems();
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (comp.compare( arr[i],arr[j]) > 0) {

                    Comparable a =  arr[i];

                    arr[i] = arr[j];
                    arr[j] = a;

                }
            }
        }

    }
    public Iterator iterator() {
        return new IteratorData();

    }

    public class IteratorData implements Iterator {
        public int index;

        @Override
        public Object next() {
            return data[index++];
        }

        @Override
        public boolean hasNext() {
            return index < data.length;
        }
    }
}
