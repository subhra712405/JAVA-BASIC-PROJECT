import java.util.Scanner;

public class Circumface{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Redius of circel...");
        double redius=input.nextDouble();
        System.out.println("The circumface of circal is"+2*Math.PI*redius);
    }
}