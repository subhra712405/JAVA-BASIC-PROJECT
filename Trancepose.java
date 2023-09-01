
import java.util.Scanner;

public class Trancepose {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the number of Row ");
        int row = userinput.nextInt();
        System.out.println("Enter the number of colum");
        int colum = userinput.nextInt();
        int[][] matrix = new int[row][colum];

        System.out.println("Enter the eliment of matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                matrix[i][j] = userinput.nextInt();
            }
        } 
        System.out.println("Normal Matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(matrix[i][j] + " ");
                 }
                 

            System.out.println();
            
        }
        System.out.println("The transepose matrix is  :");
        for (int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                int transepose=matrix[j][i];
                System.out.print(transepose + " ");
            }
            System.out.println();
        }
       

    }
}
