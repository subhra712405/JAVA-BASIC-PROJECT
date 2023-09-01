import java.util.Scanner;

public class AdditionMatrix{
    public static void main (String[]args){

        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter Row :");
        int row= userinput.nextInt();
        System.out.println("Enter Colum :");
        int colum = userinput.nextInt();
       
        int [][]Matrix=new int[row][colum];
          System.out.println("Enter  the eliments of matrix 1 :");
        for (int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                Matrix[i][j]=userinput.nextInt();

            }
            
        }
        System.out.println("  Matrix 1 :");
        for (int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the 2 Matrix row :");
        int row2=userinput.nextInt();
        System.out.println("Enter the 2 Matrix colum");
        int colum2=userinput.nextInt();
        int [][]Matrix2=new int[row2][colum2];
        System.out.println("Enter the eliment in  matrix 2 :");
        for(int i=0;i<row2;i++){
            for(int j=0;j<colum2;j++){
                Matrix2[i][j]=userinput.nextInt();

            }
        }
        System.out.println("The  matrix 2 :");
        for(int i=0;i<row2;i++){
            for(int j=0;j<colum2;j++){
                System.out.print(Matrix2[i][j] + " ");
            }
            System.out.println();
            
        }
            System.out.println("Sum of Two Matrix :");
             int [][]r=new int[row][colum];
               for(int i=0;i<row2;i++)
            for(int j=0;j<colum2;j++){
                r[i][j]=Matrix2[i][j] + Matrix2[i][j];
                System.out.print(r[i][j] + " ");
            }
            System.out.println();


        }
}