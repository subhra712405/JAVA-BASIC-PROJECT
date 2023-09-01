import java.util.Scanner;

public class  Difference {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row :");
        int row = input.nextInt();
        System.out.println("Enter colum :");
        int colum = input.nextInt();
        int [][]matrix = new int[row][colum];
        System.out.println("Enter eliment :");
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                matrix[i][j]=input.nextInt();

            }
        }
        System.out.println("Matrix is :");
        for(int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Row 2 ");
        int row2= input.nextInt();
        System.out.println("Enter colum 2 :");
        int colum2=input.nextInt();
        int [][]matrix2=new int[row2][colum2];
        System.out.println("Enter Eliment :");
        for(int i=0;i<row2;i++){
            for (int j=0;j<colum2;j++){
                matrix2[i][j]=input.nextInt();

            }
            
        }
        System.out.println("Matrix 2 is :");
        for (int i=0;i<row2;i++){
             for (int j=0;j<colum2;j++){
                System.out.print(matrix2[i][j] + " ");
            }
        System.out.println();
            }
        if(row!=row2){
            System.out.println("The Row of two matrix is not same : ");
        }else if (colum!=colum2) {
            System.out.println("Colum of two matrix is not same :");
        } else {
            System.out.println("No Difference Between Two matrixs :");
        }

    }
}