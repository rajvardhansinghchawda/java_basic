
public class maths {

    public static void main(String[] args) {
        // for converting float into int and double into long
        int result1 = Math.round(11.1f);
        System.out.println(result1);
        int result2 = (int) Math.ceil(11.1f);
        System.out.println(result2);
        int result3 = (int) Math.floor(15.1f);
        System.out.println(result3);
        int maximum = Math.max(4, 5);
        System.out.println(maximum);
        int minimum = Math.min(4, 5);
        System.out.println(minimum);

        int randomnum = (int) (Math.random() * 100);
        System.out.println(randomnum);
        int x = 10, y = 2;
        System.out.println(Math.pow(x, y));

    }

}
