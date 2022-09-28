package Home_Work_5.UtilsGenerators;

import Home_Work_5.Interface.ICreate;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RealNameGenerator implements ICreate {
    public String create(){
        SecureRandom rand = new SecureRandom();

        List<String> names = new ArrayList<>();
        names.add("Данила");
        names.add("Витя");
        names.add("Саша");
        names.add("Ваня");
        names.add("София ");
        names.add("Виктория ");
        names.add("Дарья");
        names.add("Анастасия");
        names.add("Мария");
        names.add("Вероника");

        int i= rand.nextInt(10);
        String name = names.get(i);
        return name;
    }
}
