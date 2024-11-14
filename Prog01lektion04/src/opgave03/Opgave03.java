package opgave03;

import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        gangeMetode(number);

    }
    public static void gangeMetode(int tal){
        int i = 1;

        while (i <= 10){
            System.out.printf("%4d", tal*i);
            i++;
        }
    }




}
