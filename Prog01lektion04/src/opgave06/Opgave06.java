package opgave06;

import java.util.Objects;
import java.util.Scanner;
import java.io.*;

public class Opgave06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.next();

        String reversedNumber = reverse(number);

        System.out.println("The reversed number is: " +reversedNumber);

        //boolean palindrome = isPalindrome(number, reversedNumber);

        if (isPalindrome(number, reversedNumber)) {
            System.out.println("the integer is a palindrome");
        }
        else{
            System.out.println("IS NOT A PALINDROME");
        }
    }

    public static String reverse(String number){
        String reversedNumber = "";
        char tal;

        for(int i = 0; i<number.length(); i++){
            tal = number.charAt(i);
            reversedNumber = tal + reversedNumber;
        }
        return reversedNumber;
    }


    public static boolean isPalindrome(String number, String reversedNumber){
        if(Objects.equals(number, reversedNumber)){
            return true;
        }
        else {
            return false;
        }
    }
}
