import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailchacker{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mail to chack validity...");
        String total = input.nextLine();
         boolean isvalid = Emailchacker(total);
        if(isvalid){
            System.out.println("THE MAIL IS VALID...");

        }else{
            System.out.println("THE MAIL IS INVALID...");

        }
    }
    public static boolean Emailchacker(String total) {
        String number = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(number);
        Matcher matcher=pattern.matcher(total);
        return matcher.matches();
    }
    
}