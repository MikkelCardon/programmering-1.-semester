package opgave04;

public class Opgave04 {
    public static void main(String[] args) {
        int i = 6;
        int stjerner = 1;

      while (stjerner <= i) {
          tegneProgram(stjerner);
          stjerner++;
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
