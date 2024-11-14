package opgave04;

public class Opgave04B {
    public static void main(String[] args) {
        int i = 1;
        int stjerner = 6;

      while (i <= stjerner) {
          tegneProgram(stjerner);
          stjerner--;
      }
    }

    public static void tegneProgram(int gange){
        int i = 1;

        while (i <= gange) {
            System.out.printf(" *");
            i++;
        }
        System.out.print("\n");
    }
}
