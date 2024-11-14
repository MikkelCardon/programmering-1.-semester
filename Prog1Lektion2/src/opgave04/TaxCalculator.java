package opgave04;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        //Variabler
    int personFradrag = 48000;
    int indkomstMåned;
    int indkomstÅr;
    int skattepligtigIndkomst;
    double topSkat = 0;
    double topskatGrænse = 568900;

    Scanner input = new Scanner(System.in);

    System.out.print("Indtast din månedlige indkomst: ");
    indkomstMåned = input.nextInt();

    //Skattepligtig indkomst
    indkomstÅr = indkomstMåned * 12;
    skattepligtigIndkomst = indkomstÅr - personFradrag;

    //Regner topskatten
    if(skattepligtigIndkomst > topskatGrænse){
        topSkat = (skattepligtigIndkomst-topskatGrænse)* (15.0)/100;

        System.out.println(" \n ØV DU SKAL BETALE TOPSKAT");
    }



    double skatÅr = skattepligtigIndkomst * (37.0/100) + topSkat;

    System.out.println("Årlig indkomst     : " + indkomstÅr + " kr.");
    System.out.println("Årlig beskatning   : " + skatÅr + " kr.");
    if (topSkat > 0) {
        System.out.println("Heraf udgør topskat: " + topSkat + " kr.");
    }









    }

    public static int calculateTax(int monthlyIncome) {
        return -1;
    }
}
