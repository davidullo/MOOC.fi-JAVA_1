
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        System.out.println("First number?");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int n2 = Integer.valueOf(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            temp += i;
        }
        System.out.println("The sum is " + temp);
    }
}
