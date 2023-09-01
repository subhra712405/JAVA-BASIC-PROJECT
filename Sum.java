import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);

        System.out.println("original list is" + numbers);
        
        int sum = 0;
        for (int num : numbers){
            sum = sum + num;
        }
        System.out.println("the sum of list is " + sum);
    
}
}