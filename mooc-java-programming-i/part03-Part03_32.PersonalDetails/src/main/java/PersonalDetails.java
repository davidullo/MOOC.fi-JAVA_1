
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String longestName = "";
        double sum = 0;
        double average = 0;
        int count = 0;
        while (true) {
            String nameBirth = scanner.nextLine();
            if (nameBirth.equals("")) {
                break;
            }
            String[] parts = nameBirth.split(",");
            if (parts[0].length() > longest) {
                longest = parts[0].length();
                longestName = parts[0];
            }
            count++;
            sum += Integer.valueOf(parts[1]);
            average = sum / count;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
