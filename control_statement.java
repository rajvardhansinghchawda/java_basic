
import java.util.Scanner;

public class control_statement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("print value of number");
        int num = input.nextInt();

        while (!(num > 1000 && num < 1000000)) {
            System.out.println("entre number between 1000- 1000000");
            num = input.nextInt();
            if (num > 1000 && num < 1000000) {
                break;
            }

        }
    }
}
