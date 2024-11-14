package opgave03;

import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arrayNumbers = {3, 2, 3, 4, 5, 6};

        int[] reversedArray = reverse(arrayNumbers);


        for(int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }

    public static int[] reverse(int[] arrayNumbers){
        int[] reversedArray = new int[arrayNumbers.length];

        for (int i = 0; i < arrayNumbers.length ; i++) {
            reversedArray[i] = arrayNumbers[arrayNumbers.length-1-i];
        }
        return reversedArray;
    }
}
