package opgave02.models;

public class Gift {
    String description;
    double price;
    private Person person;

    public Gift(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPerson(Person person){
        this.person = person;
    }

}
