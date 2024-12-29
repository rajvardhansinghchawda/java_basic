
public class casting {

    public static void main(String[] args) {
        short x = 2;
        int y = x + 3;// auto casting x short to integer

        System.out.println(y);
        // for converting srtings into ( short , double int etc) we have class and methods
        String abc = "1";
        int z = Integer.parseInt(abc) + 3;
        System.out.println(z);
        String abcd = "2.1";
        double num = Double.parseDouble(abcd) + 3.1;
        System.out.println(num);
    }

}
