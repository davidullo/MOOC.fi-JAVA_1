
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        int base1 = 5000;
        int base2 = 25000;
        int base3 = 55000;
        int base4 = 200000;
        int base5 = 1000000;
        int lower1 = 100;
        int lower2 = 1700;
        int lower3 = 4700;
        int lower4 = 22100;
        int lower5 = 142100;
        double rate1 = 0.08;
        double rate2 = 0.10;
        double rate3 = 0.12;
        double rate4 = 0.15;
        double rate5 = 0.17;
        if (gift < base1) {
            System.out.println("No tax!");
        } else if (gift >= base1 && gift <= base2) {
            double toPay = lower1 + (gift - base1) * rate1;
            System.out.println("Tax: " + toPay);
        } else if (gift >= base2 && gift <= base3) {
            double toPay = lower2 + (gift - base2) * rate2;
            System.out.println("Tax: " + toPay);
        } else if (gift >= base3 && gift <= base4) {
            double toPay = lower3 + (gift - base3) * rate3;
            System.out.println("Tax: " + toPay);
        } else if (gift >= base4 && gift <= base5) {
            double toPay = lower4 + (gift - base4) * rate4;
            System.out.println("Tax: " + toPay);
        } else {
            double toPay = lower5 + (gift - base5) * rate5;
            System.out.println("Tax: " + toPay);
        }
        
    }
}
