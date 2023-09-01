import java.util.ArrayList;

public class LargestPalindrom{

    
    public static void main(String[]args){
        ArrayList<String>mylist=new ArrayList<>();
        String sentence = "my name is subhra, may i come in madam";
        String[] words=sentence.split("\\s+");
        for(String word : words){
            System.out.println(word);
            mylist.add(word);
           

        }
         System.out.println(mylist);
         
        
        
    }
}