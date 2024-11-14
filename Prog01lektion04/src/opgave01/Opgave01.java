package opgave01;

import java.util.Scanner;

public class Opgave01 {
    public static void main(String[] args) {
        int tal = 2;
        int tal2 = 0;

        Scanner input = new Scanner(System.in);

        int stop = input.nextInt();


        int sum = evenNumbers(tal, stop);
        System.out.println(sum);

        int sum2 = qubicNumbers(tal2, stop);
        System.out.println(sum2);
    }

    public static int qubicNumbers(int tal, int stop){
        int sum2 = 0;

        while (Math.pow(tal, 2) < stop){
                sum2 += Math.pow(tal, 2);

            tal++;
        }
        return sum2;
    }

    public static int evenNumbers(int tal, int stop){
        int sum = 0;

        while (tal <= stop){
            if(tal % 2 == 0){
                sum += tal;
            }
            tal++;
        }
        return sum;
    }

}
