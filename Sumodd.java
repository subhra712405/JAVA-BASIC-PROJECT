import java.util.Scanner;

public class Sumodd{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter limit to sum the odd numbers");
        int limit = input.nextInt();
        int sum = 0;
        for(int i = 1;i<=limit;i++){
            if(i%2!=0){
                sum+=i;

            }
        }
        System.out.println("the of sum odd number from 1 to"  +  limit  +  "is"  +  sum);
    }
}