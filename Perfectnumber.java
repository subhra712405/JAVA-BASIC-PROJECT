import java.util.Scanner;

public class Perfectnumber{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to chack Perfect or not...");
        int total = input.nextInt();
        boolean number = isPerfect(total);
        if(number){
            System.out.println("the number is perfect number");
        }else{
           System.out.println("the number is not perfect number"); 
        }
    }
    public static boolean isPerfect(int total){
        int sum = 0;
        for (int i = 1;i<=total/2;i++){
            if(total%i==0){
                sum+=i;
            }

            
        }
        return sum==total ;
    }
}