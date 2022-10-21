package Home_Work_7.task7;

import Home_Work_7.dto.EasySearch;
import Home_Work_7.dto.Reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Searcher {

    public void searcher(String adress, String nameFile) {
        File file = new File(adress + "\\result.txt");
        Scanner scan = new Scanner(System.in);
        EasySearch search = new EasySearch();

        try {
            if (file.createNewFile()) {
                System.out.println("файл создан, путь: " + adress);
            }
        } catch (IOException e) {
            System.out.println("проверьте путь");
        }
        String word = "";


        Reader reader = new Reader();
        long counter;
        String words = reader.readFromAdress(nameFile);
        while (!checkForExit(word)){
            System.out.println("Введите слово для поиска");
            word = scan.nextLine();
            if (!checkForExit(word)){
                counter = search.search(words, word);
                System.out.println("слово: " + word + ", количество: " + counter);
                getResult(file, nameFile, word, counter);
                System.out.println("введи /return для выхода");
                System.out.println("________________________________________");
            }

        }
    }

    public void getResult(File file, String name, String word, long counter) {
        try (FileWriter write = new FileWriter(file, true)) {
            String text = "file name: " + name + ", word: " + word + ", amount:" + counter+"\n";
            write.write(text);
            write.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean checkForExit(String word){
        String str="/return";
        return word.equals(str);
    }
}
