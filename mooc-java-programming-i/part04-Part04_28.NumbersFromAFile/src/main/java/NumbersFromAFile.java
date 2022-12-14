
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file)))
        {
            while (fileReader.hasNextLine())
            {
                int looked = Integer.valueOf(fileReader.nextLine());
                if (looked < lowerBound || looked > upperBound)
                {
                    continue;
                } else
                {
                    count++;
                    continue;
                }
            }
        } catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Numbers: " + count);
    }

}
