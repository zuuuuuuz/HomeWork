package Home_Work_7.dto;

import Home_Work_7.api.ISearchEngine;
import Home_Work_7.decorators.SearchEngineRegisterNormalizer;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Reader text = new Reader();

        List str = text.readToList();
        Set<String> wordsSet=text.readToSet();


        //System.out.println("коллекция readToSet");
        //System.out.println(text.readToSet());
        //System.out.println( "с длиной - " + text.readToSet().size());


        System.out.println("topUsedWords слов в тексте");
        System.out.println(text.topUsedWords(str,100));

     System.out.println("Введите 'Да', если поиск без регистра");
     Scanner console = new Scanner(System.in);
     ISearchEngine searchEngine;
     if("Да".equals(console.nextLine())) {
      searchEngine = new SearchEngineRegisterNormalizer(new RegExSearch());
     } else {
      searchEngine = new RegExSearch();
     }

     System.out.println("Слово война : " + searchEngine.search(str.toString(),"война"));
     System.out.println("Слово и : " + searchEngine.search( str.toString(), "и"));
     System.out.println("Слово мир : " + searchEngine.search(str.toString(),"мир"));

    }

}
