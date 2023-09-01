import java.util.ArrayList;
import java.util.Scanner;

public class Sumarray{
    public static void main (String[]args){
        ArrayList<Integer> userinput= new ArrayList<>();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of list...");
        String sizestr=input.nextLine();
        int size=Integer.parseInt(sizestr);
        int[]numbers=new  int[size];
        System.out.println("Enter"+size+"numbers");
        for(int i=0;i<size;i++){
            numbers[i]=input.nextInt();
           userinput.add(numbers[i]); 
        }
        
            // System.out.println("the list is"+userinput);
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=numbers[i];
        }
        System.out.println("The sum of"+userinput+"is"+sum);
    }
}