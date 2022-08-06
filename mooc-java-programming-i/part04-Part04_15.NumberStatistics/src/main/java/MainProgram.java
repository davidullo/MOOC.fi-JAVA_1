
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        System.out.println("Enter numbers:");
        while (true)
        {
            int entered = Integer.valueOf(scanner.nextLine());
            if (entered == -1)
            {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + statisticsEven.sum());
                System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
                break;
            } else
            {
                statistics.addNumber(entered);
                if (entered % 2 == 0)
                {
                    statisticsEven.addNumber(entered);
                } else
                {
                    statisticsOdd.addNumber(entered);
                }
            }
        }
    }
}
