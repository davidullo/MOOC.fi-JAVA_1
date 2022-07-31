
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double countNumbers = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum += number;
                countNumbers += 1;
                continue;
            } else {
                continue;

            }
        }
        double average = sum / countNumbers;
        if (sum <= 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(average);
        }
    }
}
