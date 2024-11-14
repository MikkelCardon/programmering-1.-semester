package opgave05;
import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sumOfNumbers = sumDigits(number);
        System.out.println(sumOfNumbers);
    }

    public static int sumDigits(int number){
        int sumOfDigits = 0;

        while (number > 0){
            sumOfDigits += number % 10;
            number /= 10;
        }

       return sumOfDigits;
    }
}
