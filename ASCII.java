import java.util.Scanner;

public class ASCII{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Charecter To Chack ASCII value");
        char total = input.next().charAt(0);
        int total2 = (int)total ;
        System.out.println("The ACSII value is"+total2);

    }
}