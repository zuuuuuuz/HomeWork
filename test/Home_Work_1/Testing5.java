package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing5 {
    @Test
    public void sleepIn(){
        Main5 smth = new Main5();
        Assertions.assertEquals(true, smth.sleepIn(true, true));
    }
    @Test
    public void sleepIn2(){
        Main5 smth = new Main5();
        Assertions.assertEquals(false, smth.sleepIn(true, false));
    }
    @Test
    public void sleepIn3(){
        Main5 smth = new Main5();
        Assertions.assertEquals(true, smth.sleepIn(false, true));
    }
    @Test
    public void sleepIn4(){
        Main5 smth = new Main5();
        Assertions.assertEquals(true, smth.sleepIn(false, false));
    }
}
