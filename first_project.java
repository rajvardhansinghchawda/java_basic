
import java.text.NumberFormat;
import java.util.Scanner;

public class first_project {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("entre principle value:");

        long principle_value = inputs.nextLong();
        while (!(principle_value > 1000 && principle_value < 1000000)) {
            System.out.println("entre number between 1000- 1000000");
            principle_value = inputs.nextInt();
            if (principle_value > 1000 && principle_value < 1000000) {
                break;
            }

        }

        System.out.println("\nentre annual intreset rate:");

        double AIR = inputs.nextDouble();
        while (!(AIR > 0 && AIR <= 30)) {
            System.out.println("Number should be greater than 0 and less than or equal to 30");
            AIR = inputs.nextInt();
            if (AIR > 0 && AIR <= 30) {
                break;
            }

        }

        System.out.println("\nentre year: ");

        int year_value = inputs.nextInt();

        while (!(year_value > 1 && year_value < 30)) {
            System.out.println("Number should in between 1 and  30");
            year_value = inputs.nextInt();
            if (year_value > 1 && year_value < 30) {
                break;
            }

        }

        double mortgage;

        AIR = ((AIR / 100) / 12);

        year_value = year_value * 12;

        mortgage = principle_value * ((AIR * Math.pow(1 + AIR, year_value)) / (Math.pow(1 + AIR, year_value) - 1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println(currency.format(mortgage));

    }

}
