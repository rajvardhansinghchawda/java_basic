
import java.text.NumberFormat;

public class formatingnumber {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.89);
        System.out.println(result);
        String result2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2);
    }
}
