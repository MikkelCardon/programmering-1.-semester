package opgave02;
import java.util.Scanner;

public class Opgave2_1 {
    public static void main(String[] args) {

        //FEJL. DER ER BYTTET RUNDT PÅ MILES OG KILOMETER

        Scanner input = new Scanner(System.in);

        System.out.print("Indtast antal km: ");
        double km = input.nextDouble();

        double miles = km * 1.6;

        System.out.println(km + " km er det samme som "+ miles + " miles");

    }
}
