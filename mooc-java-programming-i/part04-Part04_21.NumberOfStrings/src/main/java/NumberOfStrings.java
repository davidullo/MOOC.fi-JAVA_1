
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String word = "";        
        while (true) {
            if (word.equals("end")) {
                break;
            }
            word = scanner.nextLine();
            count++;
        }
        System.out.println(count - 1);
    }
}
