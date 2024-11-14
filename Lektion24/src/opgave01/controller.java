package opgave01;

import opgave01.models.Car;
import opgave01.models.Rental;

public class controller {
    public static void main(String[] args) {
        Car car1 = new Car("EA12", "2012", 300);
        Car car2 = new Car("XY00", "1901", 1200);
        Car car3 = new Car("BT99", "2024", 700);

        Rental rental1 = new Rental(1, "01-07-2024", 5);
        Rental rental2 = new Rental(2, "01-07-2024", 2);
        Rental rental3 = new Rental(3, "01-07-2024", 13);
        Rental rental4 = new Rental(4, "01-07-2024", 13);



        rental1.addCarToRental(car1);
        car1.addRentaltoCar(rental2);

        car1.addRentaltoCar(rental3);


        System.out.println(car1.mostDaysRented());
    }
}
