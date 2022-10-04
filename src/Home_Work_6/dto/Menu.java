package Home_Work_6.dto;

import Home_Work_6.api.IMenu;
import Home_Work_6.api.IMenuRow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {
    private List<IMenuRow> items=new ArrayList<IMenuRow>();
    public Menu(){
        String str = null;
        int count=0;
        boolean state = true;
        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader("E:\\JetBrains\\project\\JD1\\HomeWork\\src\\Home_Work_6\\dto\\Menu.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        try{
            while (true){
                if ((str = reader.readLine())==null) break;
                ++count;
                String name = str;

                if ((str = reader.readLine())==null) break;
                ++count;
                int size = Integer.parseInt(str);

                if ((str = reader.readLine())==null) break;
                ++count;
                String description = str;

                if ((str = reader.readLine())==null) break;
                ++count;
                double price = Double.parseDouble(str);

                items.add(new MenuRow(new PizzaInfo(name,description,size),price));
            }
            if (count % 4 != 0){
                throw new IOException();
            }
        } catch (IOException e) {
            throw new RuntimeException("В файле меню не хватает пунктов");
        }
    }

    public String toString(){
        StringBuilder resultMenu = new StringBuilder();
        resultMenu.append("________________[Меню]_________________\n");


        for (int i=0;i<items.size();++i){
            resultMenu.append(items.get(i).getDescription()).append("Цена: ").append(items.get(i).getPrice()).append("\n_______________________________________________________________\n");
        }
        return resultMenu.toString();
    }

    public List<IMenuRow> getItems() {
        return items;
    }

}
