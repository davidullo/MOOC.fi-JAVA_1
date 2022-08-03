
public class AdvancedAstrology {

    public static void printStars(int number) {
        String star = "*";
        int count = 0;
        while (count < number) {
            System.out.print(star);
            count++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        int count = 0;
        int stars = 1;
        while (count < size) {
            printSpaces(size - stars);
            printStars(stars);
            stars++;
            count++;
        }
    }

    public static void christmasTree(int height) {
        int count = 0;
        int stars = 1;
        while (count < height) {
            printSpaces(height - stars);
            printStars(stars + (stars - 1));
            stars++;
            count++;
        }
        int max = 2;
        int base = 0;
        while (base < max) {
            printSpaces(height - 2);
            printStars(3);
            base++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(10);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(5);
        System.out.println("---");
        christmasTree(6);
        System.out.println("---");
        christmasTree(7);
    }
}
