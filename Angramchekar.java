import java.util.Arrays;
import java.util.Scanner;

public class Angramchekar {
    public static boolean Angramtester(String word1 , String Word2 ){
       String first = word1.toLowerCase().replaceAll("[^a-z]","");
        String second = word2.toLowerCase().replaceAll("[^a-z]","");


        if(first.length()!=second.length()){
            return false ;
        }
        char[]charecter1=first.toCharArray();
        char[]Charecter2=second.toCharArray();
        Arrays.sort(charecter1);
        Arrays.sort(Charecter2);

        return Arrays.equals(charecter1 ,Charecter2);
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the the secntence");
        String word1=input.nextLine();
        System.out.println("enter the second word");
        String Word2= input.nextLine();
        if(Angramtester( word1, Word2)){
            System.out.println(word1+ "and" +Word2+ "is Angram");

        }else{
            System.out.println(word1+ "and" +Word2+ "is not Angram");
        }
        input.close();
    } 
}
