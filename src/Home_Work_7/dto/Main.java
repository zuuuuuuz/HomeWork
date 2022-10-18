package Home_Work_7.dto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       Reader text = new Reader();

        List stroka = text.readToList();

        System.out.println("Печатаю коллекцию readToSet с длиной - " + text.readToSet().size());
        System.out.println(text.readToSet());

        System.out.println("Печатаю Top слов в тексте");
        System.out.println(text.topUsedWords(stroka,3));

        System.out.println("Результат EasySearch поиск \"война\"");
        RegExSearch easySearch = new RegExSearch();
        System.out.println(easySearch.search(stroka.toString(), "война"));
        System.out.println("Результат EasySearch поиск \"и\"");
        EasySearch easy6Search = new EasySearch();
        System.out.println(easySearch.search(stroka.toString(), "и"));
    }
}
