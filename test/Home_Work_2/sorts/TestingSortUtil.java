package Home_Work_2.sorts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestingSortUtil {
    @Test
    public void bubble(){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        SortUtil.bubble(arr);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, arr);
    }
    @Test
    public void bubble2(){
        int[] arr = new int[]{16, 16, 16, 16};
        SortUtil.bubble(arr);
        Assertions.assertArrayEquals(new int[]{16, 16, 16, 16}, arr);
    }
    @Test
    public void bubble3(){
        int[] arr = new int[]{9, 1, 5, 99, 9, 9};
        SortUtil.bubble(arr);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arr);
    }
}