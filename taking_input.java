
import java.util.Scanner;

public class taking_input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" entre you first name");
        String name = input.next();
        System.out.println("your first name is " + name);
        System.out.println("entre your full name ");
        Scanner inputs = new Scanner(System.in);

        String full_name = inputs.nextLine();
        System.out.println(" your full name is :" + full_name);
        Scanner age = new Scanner(System.in);
        System.out.println(" age :");
        int ages = age.nextInt();
        System.out.println("your age is " + ages);

    }

}
