import java.util.Scanner;

public class Sumofmatrix {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the number of Row\n ");
        int row = userinput.nextInt();
        System.out.println("Enter the number of colum\n");
        int colum = userinput.nextInt();
        int[][] matrix = new int[row][colum];

        System.out.println("Enter the eliment of matrix\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                matrix[i][j] = userinput.nextInt();
            }
        }
        System.out.println("Matrix is\n");
        int sum = 0;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < colum; j++) {
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println("\n");

        }
        System.out.println("the sum of all eliments is  :" + sum);
    }
}
