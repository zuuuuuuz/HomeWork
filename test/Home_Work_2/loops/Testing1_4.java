package Home_Work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing1_4 {
    @Test
    public void multiple(){
        Main1_4 smth = new Main1_4();
        Assertions.assertEquals(3243919932521508681L, smth.multipleMax(21));
    }
    @Test
    public void multiply1(){
        Main1_4 smth = new Main1_4();
        Assertions.assertEquals( 2558036924386500591L, smth.multipleMax(111));
    }
}
