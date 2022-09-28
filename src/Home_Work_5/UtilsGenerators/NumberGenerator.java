package Home_Work_5.UtilsGenerators;

import Home_Work_5.Interface.ICreate;

import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator implements ICreate {
    private ThreadLocalRandom random = ThreadLocalRandom.current();
    private int min;
    private int max;

    public NumberGenerator(int a){
        this.min = a;
        this.max = a;
    }

    public NumberGenerator(int min,int max){
        this.min = min;
        this.max = max;
    }
    public NumberGenerator(){
        this.min = 1;
        this.max = 10;
    }
    public String create(){
        int a = this.random.nextInt(this.min,this.max+1);
        StringBuilder build = new StringBuilder();
        for (int i = 1 ; i< a;i++){
            build.append(this.random.nextInt(10));

        }
        return build.toString();
    }
}
