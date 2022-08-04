
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int index = 0;
        int count = 0;
        boolean found = false;
//        int found = 0;
        while (index < array.length) {
            if (searching == array[index]) {
                found = true;
                System.out.println(searching + " is at index " + count + ".");
                count++;
                index++;
                break;
            } else {
                found = false;
                count++;
                index++;
                continue;
            }
        }
        if (found != true) {
            System.out.println(searching + " was not found.");
        }
    }

}
