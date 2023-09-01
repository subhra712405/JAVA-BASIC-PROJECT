import java.util.Scanner;

public class Sumprime{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter limit of sum");

        int limit =input.nextInt();
        int sum =0;
        for (int number = 2;number<=limit;number++){
            if(isprime(number)){
                sum+=number;
            }
        }
        System.out.println("sum is "+sum);
        }
        public static boolean isprime(int number){
            if(number<=1){
                return false ;
            }
            for (int Divisor =2;Divisor<=Math.sqrt(number);Divisor++){
                if(number%Divisor==0){
                    return false ;
                }
            }
            return true ;
        }
    }
