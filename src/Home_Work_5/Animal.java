package Home_Work_5;

import java.util.Objects;

public class Animal {
    private int age;
    private String nick;

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int hashCode(){
        return Objects.hash(age,nick);
    }

    public String toString(){
        return "Person{"+"age= "+age+", nick= "+nick+"}";
    }


}
