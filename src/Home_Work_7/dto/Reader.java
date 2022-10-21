package Home_Work_7.dto;

import Home_Work_7.comparators.ComparatorMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reader {

    public static BufferedReader reader = null;
    private List<String> wordsList = new ArrayList<>();
    private Set<String> wordsSet = new HashSet<>();
    private String line = null;
    public char delimetr = ' ',delimetr2='"';

    public Set<String> readToSet(){
        try {
            reader = new BufferedReader(new FileReader("HomeWork\\src\\Home_Work_7\\Война и мир_книга.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            while (true) {
                if ((line = reader.readLine()) == null) break;

                line=remover(line);

                String word = "";
                int lineLenght=line.length();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != delimetr && line.charAt(i)!=delimetr2){
                        word += line.charAt(i);
                    } else if (word != "") {
                        wordsSet.add(word);
                        word = "";
                    }
                }
            }
            } catch (IOException e) {
            System.out.println(e.getMessage());
            }
        return wordsSet;
    }
    public String readFromAdress(String adress){
        String text="";
        try {
            reader = new BufferedReader(new FileReader(adress));
            int read=reader.read();

            while((read=reader.read()) != -1){
                text = text +(char)read;
            }
        } catch (FileNotFoundException e) {
            System.out.println("path not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return text;
    }
    public String remover(String line){
              line=line.replaceAll("\\."," ")
                .replaceAll(","," ")
                .replaceAll("!"," ")
                .replaceAll("\\?"," ")
                .replaceAll(";"," ")
                      .replaceAll("\\n"," ")

                      .replaceAll(":"," ")
                .replaceAll(" -"," ")
                .replaceAll("- "," ")
                .replaceAll("\\("," ")
                .replaceAll("\\)"," ");
         return line;
    }

    public List readToList(){
        try {
            reader = new BufferedReader(new FileReader("HomeWork\\src\\Home_Work_7\\Война и мир_книга.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            while (true) {
                if ((line = reader.readLine()) == null) break;

                line=remover(line);

                String word = "";
                int lineLenght=line.length();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != delimetr && line.charAt(i)!=delimetr2){
                        word += line.charAt(i);
                    } else if (word != "") {
                        wordsList.add(word);
                        word = "";
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordsList;
    }
    public List topUsedWords(List<String> wordsList,int amount){
        Map<String, Integer> map = wordsList.stream()
                .collect(Collectors.toMap(Function.identity(),value -> 1,Integer::sum));
        List topUsed= new ArrayList(map.entrySet());
        topUsed.sort(new ComparatorMap());

        List topUsedWords=topUsed.subList(0,amount);
        return topUsedWords;

    }

}
