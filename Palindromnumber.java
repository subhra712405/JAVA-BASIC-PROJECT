import java.util.Scanner;

public class Palindromnumber {
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        return isPalindromeRecursive(str);
    }

    public static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number to chack the number is palinderom or not...");

        int number =input.nextInt();
        if (isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
