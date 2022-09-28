package Home_Work_5.UtilsGenerators;

import Home_Work_5.Interface.ICreate;

import java.util.concurrent.ThreadLocalRandom;

public class RusStringGenerator implements ICreate {
    private ThreadLocalRandom random = ThreadLocalRandom.current();
    private int min;
    private int max;
    private String abcd = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";

    public RusStringGenerator(int a){
        this.min = a;
        this.max = a;
    }

    public RusStringGenerator(int min,int max){
        this.min = min;
        this.max = max;
    }
    public RusStringGenerator(){
        this.min = 1;
        this.max = 10;
    }
    public String create(){
        int a = this.random.nextInt(this.min,this.max+1);

        StringBuilder build = new StringBuilder();
        for (int i = 1 ; i< a;i++){
            int numberRand= random.nextInt(abcd.length()-1);
            build.append(abcd.charAt(numberRand));

        }
        return build.toString();
    }
}
