
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 1;
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            temp *= i;
        }
        System.out.println("Factorial: " + temp);
    }
}
