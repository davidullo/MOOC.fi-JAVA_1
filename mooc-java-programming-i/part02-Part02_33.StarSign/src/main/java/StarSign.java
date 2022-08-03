
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String star = "*";
        int count = 0;
        while (count < number) {
            System.out.print(star);
            count++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int count = 0;
        while (count < size) {
            printStars(size);
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        int count = 0;
        while (count < height) {
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {
        int count = 0;
        int stars = 1;
        while (count < size) {
            printStars(stars);
            stars++;
            count++;
        }
    }
}
