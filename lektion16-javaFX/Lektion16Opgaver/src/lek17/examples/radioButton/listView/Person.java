package lek17.examples.radioButton.listView;

public class Person {
    String firstName;
    String lastName;
    String email;

    public Person(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String toString(){
        return firstName + " " + lastName + " (" + email + ")";
    }
}
