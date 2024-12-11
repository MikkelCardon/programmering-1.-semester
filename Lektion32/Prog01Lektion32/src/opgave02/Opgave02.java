package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        String[] names = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        printArray(names);
        bubbleSort(names);
        printArray(names);
    }


    private static void bubbleSort(String[] names) {
        boolean beenSwapped = true;

        while(beenSwapped){
            beenSwapped = false;
            for (int i = 0; i < names.length-1; i++) {
                if (names[i].compareTo(names[i+1]) > 0){
                    String temp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp;
                    beenSwapped = true;
                }
            }
        }
    }

    public static void printArray(String[] names) {
        System.out.printf("[" + String.join(", ", names) + "]\n");
    }
}
