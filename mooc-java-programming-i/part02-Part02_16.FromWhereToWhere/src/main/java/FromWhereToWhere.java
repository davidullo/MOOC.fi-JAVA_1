
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?");
        int toNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int fromNum = Integer.valueOf(scanner.nextLine());
        for (int i = fromNum; i <= toNum; i++){
            System.out.println(i);
        }
        
    }
}
