import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLargestnumber {
    public static void main(String[] args) {
        ArrayList<Integer>userinput = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size list");
        String Sizestr = input.nextLine();
        int Size = Integer.parseInt(Sizestr);
        int[] number = new int[Size];
        System.out.println("Enter" + Size + "numbers");
        for (int i = 0; i < Size; i++) {
            number[i] = input.nextInt();
    
            
        }
        for (int i = 0; i < Size; i++) {
            userinput.add(number[i]);
            
            
        }
        System.out.println(userinput);
        Collections.sort(userinput);
        int Largest = userinput.get(userinput.size()-1);
        System.out.println("the largest number in the Array is"+Largest);

    }
}