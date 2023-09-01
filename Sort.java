import java.util.ArrayList;
import java.util.Collections;

public class Sort  {
    public static void main (String[]args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(4);
        input.add(8);
        input.add(1);
        Collections.sort(input);
        System.out.println("the sorted list is"+input);
    }
}