package Home_Work_5.UtilsGenerators;

import java.io.*;
import java.security.SecureRandom;

public class RealNickFromFile {

    private SecureRandom rand = new SecureRandom();

    public String generate(){
        String nick="";
        try{
            int c = this.rand.nextInt(10);
            File nicks = new File("Home_Work_5/Files/Nicks.txt");
            BufferedReader read =  new BufferedReader(new FileReader(nicks));
            for (int i=1;i <=c;i++){
                if (i== c){
                    nick = read.readLine();
                }else {
                    read.readLine();
                }
            }
            return nick;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
