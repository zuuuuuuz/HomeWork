package Home_Work_7.task7;

import java.io.File;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String name = "";
        String adress = null;
        String[] allFiles = new String[0];
        Searcher searcher = new Searcher();
        Scanner scan = new Scanner(System.in);
        boolean flag=true;
        try {
            System.out.println("Input adress of folder with books ");
            adress = scan.nextLine();
            File directory = new File(adress);
            allFiles = directory.list();
            if(directory.exists()){
                System.out.println("Путь найден");
            }else throw new RuntimeException();
        } catch (RuntimeException e) {
            flag=false;
            System.out.println("неверный путь");
        }


        while (!name.equals("/return") && flag) {

            System.out.println("______________files in this folder:______________ ");
            assert allFiles != null;
            boolean state = true;
            for (String file : allFiles) {
                System.out.println(file);
            }
            System.out.println("________________________________________");
            System.out.println("input file name in format: name.format \nexample: WarAndPeace.txt\nдля выхода введите /return");
            System.out.println("________________________________________");
            while (state && !name.equals("/return")) {
                name = scan.nextLine();
                for (String file : allFiles) {
                    if (file.equals(name)) {
                        state = false;
                    }

                }
                if (state){
                    System.out.println("wrong file name");
                }
            }
            if (!name.equals("/return")) {
                String path=adress+"\\"+name;
                File files = new File(path);
                searcher.searcher(adress, path);


            }
        }
        System.out.println("Спасибо, пока");

    }
}
