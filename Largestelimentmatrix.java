import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largestelimentmatrix{
    public static void main(String[]args){
        List<Integer> Mylist = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row \n ");
        int row=sc.nextInt();
        System.out.println("Enter the colum \n ");
        int colum=sc.nextInt();

        int [][]number=new int[row][colum];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                number[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("The matrix is :\n");
        for(int i=0;i<row;i++){
            for(int j=0;j<colum ;j++){
                System.out.print(number[i][j] + " ");

            }
            System.out.println("\n");
        }
    
        int largestelimnr=findlargesteliment(number);
        System.out.println("The largest elimnt is  :"+largestelimnr);
    }
    public static int findlargesteliment(int[][]matrix){
        int largestelimnr   =matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(largestelimnr<matrix[i][j]){
                    largestelimnr=matrix[i][j];
                }

            }
        }
        return largestelimnr ;
    }

}