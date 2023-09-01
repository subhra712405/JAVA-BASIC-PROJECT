import java.util.ArrayList;
import java.util.Collections;

public class Secondlargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        System.out.println("the original  list is " + list);
        {
            Collections.sort(list);
            long larg = list.get(1);
            System.out.println("the second largest number is " + larg);
        
            
        }
    }
}
        
    
