import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a Fahrenhit tempareture  :");
        int temp = scanner.nextInt();
        int c = temp - 32;
        double d = c / 1.8;
        System.out.println("Ypur tempareture is " + d);
    }
}
