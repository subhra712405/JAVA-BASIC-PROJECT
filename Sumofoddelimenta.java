import java.util.Scanner;

public class Sumofoddelimenta{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter row");
        int row= input.nextInt();
        System.out.println("Enter colum");
        int colum=input.nextInt();
        int [][]matrix = new int[row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                if(i%2!=0 && j%2!=0){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("sum of odd  number is "+sum );
    }
}