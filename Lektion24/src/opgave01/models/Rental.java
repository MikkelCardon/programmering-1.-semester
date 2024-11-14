package opgave01.models;

import java.util.ArrayList;

public class Rental {
    private int no = 0;
    private String date = "";
    private int days = 0;
    private ArrayList<Car> cars = new ArrayList<>();


    public Rental(int no, String date, int days) {
        this.no = no;
        this.date = date;
        this.days = days;
    }


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

//    public int getPrice(){
//        return getDays() * car.getPricePerDay();
//    }


    public void addCarToRental(Car car){
        cars.add(car);
        car.addRentaltoCar(this);
    }



}
