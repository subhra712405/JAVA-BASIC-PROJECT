import java.util.Scanner;
import java.util.regex.Pattern;

public class Password{
    public static void main(String[]args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter Password");
        String Pass = input.nextLine();
        if(isvalid (Pass)){
            System.out.println("VALID ");

        }else{
            System.out.println("INVALID");
        }
    }
    public static boolean isvalid(String pass){
        if(pass.length()<8||pass.length()>20){
            return false ;
        }
        String rex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$";
        Pattern pattern = Pattern.compile(rex);
            
        
        return pattern.matcher(pass).matches();
    }
}