
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String phrase = scanner.nextLine();
            String[] space = phrase.split(" ");
            for (int i = 0; i < space.length; i++) {
                if (space[i].contains("av")) {
                    System.out.println(space[i]);
                }
            }
            if (phrase.equals("")) {
                break;
            }
            
        }

    }
}
