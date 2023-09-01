import java.util.Scanner;

public class Power{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number...");
        int total = input.nextInt();
        System.out.println("Enter the power...");
        int total2 = input.nextInt();
        System.out.println("the power of "+total+"is"+Math.pow(total,total2));
    }
}