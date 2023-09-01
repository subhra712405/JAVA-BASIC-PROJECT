import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Secondlargestmatrix{
    public static void main(String[]args){
        ArrayList<Integer> mylist = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row :");
        int row=input.nextInt();
        System.out.println("Enter colum :");
        int colum=input.nextInt();
        
        System.out.println("Enter Eliment of Matrix :");
        int [][]matrix = new int [row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                
                matrix [i][j]=input.nextInt();
                mylist.add(matrix[i][j]);
                Collections.sort(mylist);
            }
            
        }
    
        System.out.println("Your Matrix is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Second largest number in the matix is : "+mylist.get(1));
    }
    
}