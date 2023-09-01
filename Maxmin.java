import java.util.ArrayList;
import java.text.CollationElementIterator;
import java.util.*;

public class Maxmin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(7);
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("original list is" + list);
        System.out.println("maximum number is " + max);
        System.out.println("minimum number is " + min);
    }
}
