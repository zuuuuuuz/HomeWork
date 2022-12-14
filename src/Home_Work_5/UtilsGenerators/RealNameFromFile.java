package Home_Work_5.UtilsGenerators;

import Home_Work_5.Interface.ICreate;

import java.io.*;
import java.security.SecureRandom;

public class RealNameFromFile implements ICreate {
    private SecureRandom random = new SecureRandom();

    public String create(){
        String name="";
        try{
            int c = this.random.nextInt(10);
            File names = new File("Home_Work_5/Files/Names.txt");
            BufferedReader read =  new BufferedReader(new FileReader(names));
            for (int i=1;i <=c;i++){
                if (i== c){
                    name = read.readLine();
                }else {
                    read.readLine();
                }
            }
            return name;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
