// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter -1 to stop):");

        int number;
        while ((number = scanner.nextInt()) != -1) {
            numbers.add(number);
        }

        System.out.println("List of numbers: " + numbers);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        numbers.clear();
        numbers.addAll(uniqueNumbers);

        System.out.println("List after removing duplicates: " + numbers);
    }
}
