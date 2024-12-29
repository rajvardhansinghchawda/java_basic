package codes;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args){
        System.out.println("entre a number\n");
        Scanner input = new Scanner(System.in);
        int number =input.nextInt() ;
         if ((number%5 == 0) && (number%3 == 0))  {
            System.out.println("fizzbuzz");
        } else if (number%3 == 0) {
            System.out.println("buzz");

        } else if (number%5 == 0) {
            System.out.println("fizz");

        } else
            System.out.println(number);

    }
}
