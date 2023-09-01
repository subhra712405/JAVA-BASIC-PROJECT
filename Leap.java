import java.time.Year;
import java.util.Scanner;

public class Leap{
    public static void main (String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the year to chek leap year or not......:");
        int Year= input.nextInt();
    
        if (Year%4==0){
            System.out.println("it is a Leap year");

        } else {
            System.out.println("it is not a leapyear");
        }
    }
}