package opgave01;

public class Opgave01 {
    public static void main(String[] args) {

        int[] tal = new int[10];

        for (int i = 0; i < 10; i++) {
            tal[i] = (int)(Math.random() * 100);
            integerArray(tal[i]);
        }


    }

    public static void integerArray(int tal ){

        System.out.println(tal);

    }
}
