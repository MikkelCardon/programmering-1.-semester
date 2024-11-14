package opgave02.models;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;

    private ArrayList<Gift> gifts = new ArrayList<>();
    private ArrayList<Person> persons = new ArrayList<>();


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String tostring(){
        return name + " "+ age;
    }

    public void addGift(Gift gift){
        gifts.add(gift);
        gift.setPerson(this);
    }

    public void removeGift(Gift gift){
        gifts.remove(gift);
        gift.setPerson(null);
    }

    public int totalValueOfGifts(){
        int totalValue = 0;
        for (Gift gift : gifts) {
            totalValue += gift.getPrice();
        }
        return totalValue;
    }

    public void giveGift(Gift gift, Person person){
        gifts.remove(gift);
        person.addGift(gift);
        person.addGiftGiver(this);
    }

    public String giftsToString(){
        String allGifts = "";
        for (Gift gift : gifts) {
            allGifts += gift.description + " ";
        }
        return allGifts;
    }

    public void addGiftGiver(Person person){
        persons.add(person);
    }

    public String getGiftGivers() {
        String giftGivers = "";
        for (Person person : persons) {
            giftGivers+= person.getName() + " ";
        }
        return giftGivers;
    }

    public String getName() {
        return name;
    }
}
