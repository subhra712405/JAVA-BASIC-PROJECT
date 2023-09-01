import java.util.Scanner;

public class Areaofractangel{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenth of rectangel ");
        double lenth = input.nextDouble();
        System.out.println("Enter the side of rectangel ");
        double side=input.nextDouble();
        System.out.println("the area is"+lenth*side);
    }
}