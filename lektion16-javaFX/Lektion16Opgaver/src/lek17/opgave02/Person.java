package lek17.opgave02;

public class Person {
    private String name;
    private String title;
    private boolean senior = false;

    public Person(String name, String title, boolean senior){
        this.name = name;
        this.title = title;
        this.senior = senior;
    }

    public String toString(){
        String s = title + " " + name;

        if (senior){
            s+= " (Senior)";
        }
        return s;
    }
}
