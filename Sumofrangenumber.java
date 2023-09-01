import java.util.Scanner;

public class Sumofrangenumber{
    public static int rangecalculator(int start,int end){
        int sum=0;
        for(int i = start;i<=end;i++){
            sum+=i;

        }
        return sum;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the star value");
        int start = input.nextInt();
        System.out.println("enter the end value");
        int end = input.nextInt();
        int total=rangecalculator(start, end);
        System.out.println("the sum value is"   +total);
    }
}