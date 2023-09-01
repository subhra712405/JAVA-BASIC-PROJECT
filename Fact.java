import java.util.Scanner;

public class Fact {
    public static int fa(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * fa(x - 1);
        }

    }

    public static void main(String[] args) {
    //    System.out.println(fa(6));
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number to calaulate the factoiral of number");
    int x= input.nextInt();
    int result = fa(x);
    System.out.println(x  +"factorial is "+  fa(x));
    }
}
