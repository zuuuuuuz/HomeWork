package Home_Work_7.task7;

import Home_Work_7.dto.EasySearch;
import Home_Work_7.dto.Reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Searcher {
    private long counter;
    private String word;

    public void searcher(String adress, String nameFile) {
        Scanner scan = new Scanner(System.in);
        EasySearch search = new EasySearch();
        File file = new File(adress + "\\result.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("файл создан, путь: " + adress);
            }
        } catch (IOException e) {
            System.out.println("проверьте путь");
        }
        String return1 = "";
        System.out.println("Введите слово для поиска");

        Reader reader = new Reader();
        String words = reader.readFromAdress(adress + " " + nameFile);
        do {
            word = scan.nextLine();
            counter = search.search(words, word);
            String word1 = word;
            getResult(file, nameFile, word1, counter);
            System.out.println("word- " + word + ", amount-" + counter);
            System.out.println("type \'return\' for exit");
        } while (!return1.equals("return"));
    }

    public void getResult(File file, String name, String word, long counter) {
        try (FileWriter write = new FileWriter(file, true)) {
            String text = "file name: " + name + ", word- " + word + ", amount-" + counter;
            write.write(text);
            write.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
