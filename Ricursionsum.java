import java.util.Scanner;

public class Ricursionsum{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to sum...");
        int sum=input.nextInt();
        int number = Sumdigit(sum);
        System.out.println("The sum is "+number);
    }
    public static int Sumdigit(int sum){
        if(sum==0){
            return 0;
        }else{
            return (sum%10)+Sumdigit(sum/10);
        }
    }
}