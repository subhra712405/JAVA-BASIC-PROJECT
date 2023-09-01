import java.util.Scanner;

public class CubeRoot{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number...");
        int  total= input.nextInt();
        System.out.println("the Cuberoot of "+total+"is"+Math.cbrt(total));
    }
}