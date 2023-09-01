import java.util.ArrayList;
import java.util.Collections;

public class Reverslist{
    public static void main(String[]args){
        ArrayList<Integer> input=new ArrayList<>();
        input.add(4);
        input.add(6);
        input.add(5);
        input.add(4);
        Collections.reverse(input);
        System.out.println("the Reverse list is "+input);
        }
}