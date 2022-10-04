package Home_Work_6.dto;

import Home_Work_6.api.IMenuRow;
import Home_Work_6.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {
    private IMenuRow row;
    private int count;

    public SelectedItem(IMenuRow row, int count) {
        this.row = row;
        this.count = count;
    }

    @Override
    public IMenuRow getRow() {
        return  this.row;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("Выбрана: ").append(getRow()).append(", количество: ").append(getCount());
        return result.toString();
    }
}
