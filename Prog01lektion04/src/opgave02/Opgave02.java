package opgave02;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;


public class Opgave02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int talX = input.nextInt();


       int resultat = fibonacciNumber(talX);
       System.out.println(resultat);


    }

    public static int fibonacciNumber(int FibbonacciTal){
        int FibboTal1 = 0;
        int FibboTal2 = 1;
        int resultatFibbo = 0;

        int i = 2;

        while(i <= FibbonacciTal){

            resultatFibbo = FibboTal1 + FibboTal2;
            FibboTal1 = FibboTal2;
            FibboTal2 = resultatFibbo;

            i++;
        }

        return resultatFibbo;
    }
}
