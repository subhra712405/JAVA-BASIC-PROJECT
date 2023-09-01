import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avarge {
    public static void main(String[] args) {
        List<Integer> userinput = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter X to add number in list");
        while (true) {
            String number = scanner.next();

            if (number == "x") {
                break;

            }
            System.out.println(userinput);
            System.out.println("user input"+userinput);
            int sum=0 ;
            for (int num:userinput) {
                sum+=num ;
            }
            double avarage=(double ) sum/userinput.size();
        System.out.println("avarge is "+userinput);
        }


    }
}


