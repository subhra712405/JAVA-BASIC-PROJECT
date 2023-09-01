import java.util.Scanner;

public class Sumrecursion{
    public static int Sumdigit(int  number){
        if(number<10){
            return number ;
        }else{
            return number%10+Sumdigit(number/10) ;
        }

    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number.....");
        int number = input.nextInt();
        int total = Sumdigit(number);
        System.out.println("the sum "+number+"is"+total);
    }
}
