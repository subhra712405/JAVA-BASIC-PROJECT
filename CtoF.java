import java.util.Scanner;

public class CtoF{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the celcius tempareture...");
        int celcius=input.nextInt();
        int farhanit=(celcius*9/5)+32;
        System.out.println("The farhenite tempareture is"+farhanit);
    }
}