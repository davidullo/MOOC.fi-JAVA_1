
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int vote = Integer.valueOf(scan.nextLine());
        if (vote < 0) {
            System.out.println("impossible!");
        } else if (vote <= 49) {
            System.out.println("failed");
        } else if (vote <= 59) {
            System.out.println("1");
        } else if (vote <= 69) {
            System.out.println("2");
        } else if (vote <= 79) {
            System.out.println("3");
        } else if (vote <= 89) {
            System.out.println("4");
        } else if (vote <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}
