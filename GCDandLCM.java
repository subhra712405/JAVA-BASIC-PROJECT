import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int calculateGCD(int x, int y) {
        if (y == 0) {
            return x;
        }
        return calculateGCD(y, x % y);
    }

    public static int calculateLCM(int x, int y, int gcd) {
        return (x * y) / gcd;
    }
}
