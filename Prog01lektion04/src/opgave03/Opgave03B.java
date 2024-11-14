package opgave03;

import java.util.Scanner;

public class Opgave03B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number <= 10) {
            gangeMetode(number);
            number++;
        }

    }
    public static void gangeMetode(int tal){
        int i = 1;

        while (i <= 10){
            System.out.printf("%4d", tal*i);
            i++;
        }
        System.out.print("\n");
    }




}
