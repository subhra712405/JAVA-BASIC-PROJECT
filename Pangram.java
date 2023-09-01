import java.util.Scanner;

public class Pangram{
    public static boolean ispangram (String str){
        str = str.toLowerCase();
        boolean[]letters= new boolean[26];
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                letters[ch-'a']=true;


            }
        }
        for (boolean letter:letters){
            if(!letter){
                return false;
            }
        }
        return true;

    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String to Chack....");
        String str = input.nextLine();
        boolean result=ispangram(str);
        if(result){
            System.out.println("It is pangram...");

        }else{
            System.out.println("It's not pangam");7
        }

    }
}