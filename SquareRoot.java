import java.util.Scanner;

public class SquareRoot{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number...");
        int total = input.nextInt();
        System.out.println("The Square Root of"+total+"is"+Math.sqrt(total));
    }
}