package Home_Work_6.dto;

import Home_Work_6.api.IMenuRow;
import Home_Work_6.api.IPizzaInfo;

import java.util.List;

public class MenuRow implements IMenuRow {
    private List<IMenuRow> items;
    private final double price;
    private final IPizzaInfo description;
    public MenuRow(IPizzaInfo description, double price) {
        this.description =description;
        this.price=price;
    }

    @Override
    public IPizzaInfo getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
