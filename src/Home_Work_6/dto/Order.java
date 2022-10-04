package Home_Work_6.dto;

import Home_Work_6.api.IOrder;
import Home_Work_6.api.ISelectedItem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
    private List<ISelectedItem> items = new ArrayList<ISelectedItem>();

    public Order(String... names){
        Menu menu = new Menu();
        for (String name:names){
            for (int i = 0; i < menu.getItems().size(); i++) {
                if(name.substring(0, name.length()-2).equals(menu.getItems().get(i).getDescription().getName())) {
                    items.add(new SelectedItem(menu.getItems().get(i), Integer.parseInt(name.substring(name.length()-1))));
                }
            }
        }
    }



    @Override
    public List<ISelectedItem> getSelected() {
        return this.items;
    }
    public String toString(){
        StringBuilder resultOrder = new StringBuilder();
        resultOrder.append("Ваш заказ: "+items);
        return resultOrder.toString();
    }
}
