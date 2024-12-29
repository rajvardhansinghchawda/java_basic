package codes;

import java.util.Scanner;

public class methods {
    public  static void main(String[] args){
        System.out.println("entre your full name" );
        String full_name = getname();
        System.out.println(full_name);
        System.out.println("entre your age");
        System.out.println( getage());
      //  System.out.println(" ypur age is " + getage());

    }
    public static String getname(){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }
    public static int getage(){

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("your age is");
        return age;
    }
}
