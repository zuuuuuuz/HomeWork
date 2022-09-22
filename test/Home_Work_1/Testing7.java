package Home_Work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing7 {
    @Test
    public void creatPhoneNumber(){
        Main7 smth = new Main7();
        Assertions.assertEquals("(585) 555-5595",smth.createPhoneNumber(new int[]{5,8,5,5,5,5,5,5,9,5}));
    }
    @Test
    public void creatPhoneNumber2(){
        Main7 smth = new Main7();
        Assertions.assertEquals("(123) 456-7890",smth.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }
}
