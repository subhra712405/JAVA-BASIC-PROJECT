import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to sum...:");
        String sum = input.nextLine();
        int total = Calculatesum(sum);
        System.out.println("sumof number is " + total);

    }

    public static int Calculatesum(String sum) {
        String[] numbers = sum.split("\\s+");
        int total2 = 0;
        for (String number : numbers)

        {
            total2 += Integer.parseInt(number);
        }
        return total2;
    }
}

