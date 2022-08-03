
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(4);
        list.add(41);
        list.add(69);
        list.add(18);
        list.add(11);
        list.add(23);

        printNumbersInRange(list, 10, 20);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range " + "[" + lowerLimit + ", " + upperLimit + "]");
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
