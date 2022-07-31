
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double countNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                sum += number;
                countNumbers += 1;
                continue;
            }
        }
        double average = sum / countNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}
