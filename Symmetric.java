import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row :");
        int row = input.nextInt();
        System.out.println("Enter colum :");
        int colum = input.nextInt();
        int[][] matrix = new int[row][colum];
        System.out.println("enter eliment to Matrixx :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        boolean symmetric = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }

            }
            if (!symmetric)
                ;
            break;
        }
        if (symmetric) {
            System.out.println("Matrix is Symmetric :");
        } else {
            System.out.println("Matrix is not Symmetric :");
        }

    }
}