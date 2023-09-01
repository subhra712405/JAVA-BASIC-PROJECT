import java.util.Scanner;

public class Tracematrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of square matrix :");
        int lenth = input.nextInt();
        int[][] matrix = new int[lenth][lenth];
        // System.out.println("Enter the eliment of matrix :");
        for (int i = 0; i < lenth; i++) {
            for (int j = 0; j < lenth; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        System.out.println("The trace of matrix is " + trace);
    }
}
