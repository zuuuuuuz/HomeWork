package Home_Work_5.UtilsGenerators;

import Home_Work_5.Interface.ICreate;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RealNickGenerator implements ICreate {
    private SecureRandom rand = new SecureRandom();
    public String create(){
        List<String> nicks = new ArrayList<>();
        nicks.add("ДанДат");
        nicks.add("Виттатрон");
        nicks.add("СуперСоник");
        nicks.add("Ванодрагон");
        nicks.add("СофеКоф ");
        nicks.add("РональдМакдональд ");
        nicks.add("Даррос");
        nicks.add("АнасНас");
        nicks.add("МарХон");
        nicks.add("Верзондр");

        int i= rand.nextInt(10);
        String nick = nicks.get(i);
        return nick;
    }
}
