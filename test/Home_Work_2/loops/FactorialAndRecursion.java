package Home_Work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialAndRecursion {
    @Test
    public void multiply(){
        Main_1_1_1 smth = new Main_1_1_1();
        Assertions.assertEquals(120, smth.factorial(5));
    }
    @Test
    public void multiply3(){
        Main_1_1_1 smth = new Main_1_1_1();
        Assertions.assertEquals(5040, smth.factorial(7));
    }
    @Test
    public void recursion(){
        Main_1_1_1 smth = new Main_1_1_1();
        Assertions.assertEquals(120, smth.recursion(5));
    }
    @Test
    public void recursion2(){
        Main_1_1_1 smth = new Main_1_1_1();
        Assertions.assertEquals(1, smth.recursion(1));
    }

}
