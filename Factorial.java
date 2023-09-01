import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scanner = input.nextInt();
        
        
        if (scanner == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            int total = 1;
            
            for (int i = scanner; i >= 1; i--) {
                total *= i;
            }
            
            System.out.println("Factorial of " + scanner + " is " + total);
        }
    }
}
