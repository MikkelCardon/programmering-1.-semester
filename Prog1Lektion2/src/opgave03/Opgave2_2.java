package opgave03;
import java.util.Scanner;


public class Opgave2_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvad er længden af sidderne?");
        double lengthOfSides = input.nextDouble();

        double area = (Math.sqrt(3.0) / 4) * Math.pow(lengthOfSides,2);
        System.out.println("Arealet er: "+area);


        double volume = area * lengthOfSides;
        System.out.println("Volumen er: "+ volume);

    }
}
