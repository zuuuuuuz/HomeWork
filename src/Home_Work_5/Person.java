package Home_Work_5;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String nick;
    private String password;  //пароль
    private String name; //irl name

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(nick,password,name);
    }

    public String toString(){
        return "Person{"+"nick= "+nick+", password= "+password+", name= "+name+"}";
    }
}
