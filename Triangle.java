import java.util.Scanner;

public class Triangle{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base lenth of triangel...");
        double total = input.nextDouble();
        System.out.println("Enter the hight of triangel...");
        double total2 = input.nextDouble();
        double area = (total*total2)/2;
        System.out.println("the area of triangel iss"+area);
    }
}