package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 4, 8, 9, 13};
        System.out.println("isSorted(numbers) = " + isSorted(numbers));
    }
// ASCENDING ORDER
    public static boolean isSorted(int[] list){
        for (int i = 0; i < list.length - 1 ; i++) {
            if (list[i] > list[i+1]){
                return false;
            }
        }
        return true;
    }
}
