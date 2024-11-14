package opgave01.models;

import java.util.ArrayList;

public class Car {
    private String no = "";
    private String year = "";
    private int pricePerDay = 0;

    private ArrayList<Rental> rentals = new ArrayList<>();

    public Car(String no, String year, int pricePerDay) {
        this.no = no;
        this.year = year;
        this.pricePerDay = pricePerDay;
    }

    public void addRentaltoCar(Rental rental){
        rentals.add(rental);
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    public int mostDaysRented(){
        int mostDaysRented = 0;

        for (Rental rental : rentals) {
            if (rental.getDays() > mostDaysRented){
                mostDaysRented = rental.getDays();
            }
        }
        return mostDaysRented;
    }
}
