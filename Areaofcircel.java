import java.util.Scanner;

public class Areaofcircel{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base...");
        double base = input.nextDouble();
        System.out.println("the are of circel is"+Math.PI*Math.pow(base,2));
    }
}