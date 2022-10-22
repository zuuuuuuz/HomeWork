package Home_Work_6.dto;

import Home_Work_6.api.IPizzaInfo;

public class PizzaInfo implements IPizzaInfo {
    private String name;

    private int size;

    private String description;

    public PizzaInfo(String name,String description,int size){
        this.name=name;
        this.size=size;
        this.description=description;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String toString(){
    StringBuilder result = new StringBuilder();
    result.append(name)
            .append("\nСостав: ").append(description)
            .append("\nДиаметр: ").append(size)
            .append("\n");
    return result.toString();
    }
}
