package opgave03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        List<Item> items = getItems();
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
    }

    private static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Papir", 30));
        items.add(new Item("Bog", 220));
        items.add(new Item("Blyant", 3));
        items.add(new Item("Penalhus", 80));
        items.add(new Item("Skoletaske", 350));
        items.add(new Item("Blyantspidser", 20));
        return items;
    }




}

