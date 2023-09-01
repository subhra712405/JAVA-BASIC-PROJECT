
import java.util.Scanner;

public class Countwords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sentence to Count Words....:");
        String line = input.nextLine();
        int count = countWords(line);
        System.out.print("Word count: " + count);
    }

    public static int countWords(String line) {
        if (line == null || line.isEmpty()) {
            return 0;
        }
        String[] words = line.trim().split("\\s+");
        return words.length;
    }
}
