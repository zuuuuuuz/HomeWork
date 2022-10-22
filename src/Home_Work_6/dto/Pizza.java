package Home_Work_6.dto;

import Home_Work_6.api.IPizza;

public class Pizza implements IPizza {
    private String name;
    private int size;

    public Pizza(String name,int size){
        this.name= name;
        this.size=size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String toString(){
        StringBuilder resultPizza = new StringBuilder();
        resultPizza.append("Название: ").append(name)
                .append(", размер: ").append(size);
        return resultPizza.toString();
    }
}
