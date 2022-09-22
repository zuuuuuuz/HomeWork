package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing4_6 {
    @Test
    public void leapYear(){
        Main4_6 smth = new Main4_6();
        Assertions.assertEquals("Год високосный", smth.leapYear(1024));
    }
    @Test
    public void leapYear2(){
        Main4_6 smth = new Main4_6();
        Assertions.assertEquals("Год не високосный", smth.leapYear(2011));
    }
    @Test
    public void leapYear3(){
        Main4_6 smth = new Main4_6();
        Assertions.assertEquals("Год не високосный", smth.leapYear(9000));
    }

}
