
import java.util.Scanner;

public class while_loop {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        String input = "";
        while (!input.equals("start")) {
            System.out.println("inputs : ");
            input = inputs.next().toLowerCase();
            System.out.println(input);
        }
    }

}
