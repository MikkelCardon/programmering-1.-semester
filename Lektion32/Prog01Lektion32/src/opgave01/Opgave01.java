package opgave01;

import java.util.Random;

public class Opgave01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Pre-sorted: ");
        printArray(numbers);

        System.out.println("Sorted: ");
        selectionSort(numbers);
        printArray(numbers);
    }

    public static int[] selectionSort(int[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }
}
