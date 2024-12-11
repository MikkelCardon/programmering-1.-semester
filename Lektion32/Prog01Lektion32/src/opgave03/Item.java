package opgave03;

public class Item implements Comparable<Item>{
    String name;
    int pris;
    public Item(String name, int pris) {
        this.name = name;
        this.pris = pris;
    }

    @Override
    public int compareTo(Item other) {

        return this.name.compareTo(other.name);
    }

}
