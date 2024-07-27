package Model;

import java.util.ArrayList;

public class Section {
    private ArrayList<Item> items;

    public Section() {
        this.items=new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
