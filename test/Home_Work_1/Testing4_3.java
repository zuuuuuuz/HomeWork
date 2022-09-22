package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing4_3 {
    @Test
    public void divideOrNot1(){
        Main4_3 smth = new Main4_3();
        Assertions.assertEquals("число 4.0 делится на 2.0", smth.divideOrNot(4,2));
    }
    @Test
    public void divideOrNot2(){
        Main4_3 smth = new Main4_3();
        Assertions.assertEquals("число 69.0 делится на 23.0", smth.divideOrNot(69,23));
    }
    @Test
    public void divideOrNot3(){
        Main4_3 smth = new Main4_3();
        Assertions.assertEquals("число 69.0 не делится на 33.0\nостаток: 3.0", smth.divideOrNot(69,33));
    }

}