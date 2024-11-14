package opgave01;
import java.util.Scanner;


public class CalculateVat {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Indtast købssummen (kr.): ");
        double sum = input.nextDouble();

        double moms = sum * 0.2;

        System.out.print("Momsen af købssummen er: "+ moms+ " kr.");
    }
}
