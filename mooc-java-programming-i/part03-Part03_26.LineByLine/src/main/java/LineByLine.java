
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean continueReading = true;
        while (continueReading) {
            String phrase = scanner.nextLine();
            String[] split = phrase.split(" ");
            for (String word : split) {
                if (!(word.equals(""))) {
                    System.out.println(word);
                } else {
                    continueReading = false;
                    break;
                }
            }
        }

    }
}
