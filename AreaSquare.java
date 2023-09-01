import java.util.Scanner;

public class AreaSquare{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side lenth of squre");
        Double sidelenth= input.nextDouble();
        System.out.println("the area of square is"+sidelenth*sidelenth);
        
    }
}