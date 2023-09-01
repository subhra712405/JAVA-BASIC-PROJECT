import java.util.Scanner;

public class Stringreverse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter string to reverse  :");
    String st = scanner.nextLine();
    System.out.println(st);
    StringBuilder reversed = new StringBuilder(st).reverse();
    System.out.println(reversed);
  }
}