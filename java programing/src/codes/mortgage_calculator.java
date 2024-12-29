package codes;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage_calculator {
    public static void main (String[] agrs){


        int principle_value = (int)getvalu("principle value",1000,1000000);
        double AIR = getvalu("annual intreset rate:",0,30);
        int year_value = (int)getvalu("year :",1,30);
        AIR = ((AIR / 100) / 12);
        year_value = year_value * 12;
       mortgage_calculator(principle_value,AIR,year_value);
    }
    public static void mortgage_calculator(
            int principle_value,
            double AIR,
            int year_value){
       double mortgage = principle_value * ((AIR * Math.pow(1 + AIR, year_value)) / (Math.pow(1 + AIR, year_value) - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println(currency.format(mortgage));
        System.out.println(get_balance(principle_value, AIR, year_value)-mortgage);

    }
    public static double getvalu(String read,int max,int min){
        double value;
        while (true) {
            System.out.println("entre " +read);
            System.out.println("entre number between" +max+ " "+ min);

            Scanner inputs = new Scanner(System.in);
            value = inputs.nextDouble();

            if (value > max && value < min) {
                break;
            }

        }
        return value;
    }
    public static double get_balance(int principle, double AIR, int year){
        double balance ;
        int payment = year*12;
        double p = 1;
         balance =  principle* ( (Math.pow(1+AIR,payment)-Math.pow(1+AIR,p))) / ( Math.pow(1+AIR, payment)-1)  ;

        return balance;
    }
    }

