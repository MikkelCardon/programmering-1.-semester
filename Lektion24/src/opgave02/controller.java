package opgave02;

import opgave02.models.Gift;
import opgave02.models.Person;

public class controller {
    public static void main(String[] args) {
        Person person1 = new Person(35, "Mikkel");
        Person person2 = new Person(5, "Simon");
        Person person3 = new Person(22, "Martin");


        Gift gift1 = new Gift(250, "Tandbørste");
        Gift gift2 = new Gift(100, "Tandbørste");
        Gift gift3 = new Gift(50, "Tandbørste");

        person1.addGift(gift1);
        person1.addGift(gift2);
        person1.addGift(gift3);

        System.out.println(person1.giftsToString());

        person1.giveGift(gift1, person2);

        System.out.println(person1.giftsToString());
        System.out.println(person2.giftsToString());

        System.out.println(person2.getGiftGivers());
    }
}
