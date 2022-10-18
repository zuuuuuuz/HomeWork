package Home_Work_7.task7;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "";
        String adress;
        String[] allFiles;
        Searcher searcher = new Searcher();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input adress of folder with books ");
        adress=scan.nextLine();
        File directory = new File(adress);
        allFiles=directory.list();
        boolean state=true;
        while(state){
            System.out.println("files in this folder: ");
            for (String file : allFiles){
                System.out.println(file);
            }
            System.out.println("input file name in format: name.format \nexample: WarAndPeace.txt");
            while (state){
                name = scan.nextLine();
                for (String file:allFiles){
                    if ((file.equals(name))){
                        state=false;
                    }else System.out.println("wrong file name");
                }
            }
            if (!name.equals("return")){
                File files = new File(adress+ " "+name);
                searcher.searcher(adress,name);

            }
        }

    }
}
