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
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public String toString(){
        StringBuilder resultPizza = new StringBuilder();
        resultPizza.append("Название: ").append(getName())
                .append(", размер: ").append(getSize());
        return resultPizza.toString();
    }
}
