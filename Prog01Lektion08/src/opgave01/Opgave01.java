package opgave01;

public class Opgave01 {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 3, 3, 3, 3};
        System.out.println("isConsecutiveFour(numbers) = " + isConsecutiveFour(numbers));
    }


    public static boolean isConsecutiveFour(int[] values){

        for (int index = 0; index < values.length-3; index++) {
            if (values[index] == values[index+1]
                    && values[index] == values[index+2]
                    && values[index] == values[index+3]) {
                return true;
            }
        }
        return false;
    }
}
