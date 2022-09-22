package Home_Work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing1_3 {
    @Test
    public void ppow(){
        Main_1_3 smth = new Main_1_3();
        Assertions.assertEquals("8.0^(2) = 64.0", smth.pow(8, 2));
    }
    @Test
    public void pow1(){
        Main_1_3 smth = new Main_1_3();
        Assertions.assertEquals("2.5^(1) = 2.5", smth.pow(2.5, 1));
    }
    @Test
    public void pow2(){
        Main_1_3 smth = new Main_1_3();
        Assertions.assertEquals("0.0^(111111) = 0.0", smth.pow(0, 111111));
    }
}
