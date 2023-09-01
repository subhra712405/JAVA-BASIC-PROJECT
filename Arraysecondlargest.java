import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraysecondlargest{
    public static void main(String[]args){
        ArrayList<Integer>userIntegers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of list");
        String Sizestr = input.nextLine();
        int size = Integer.parseInt(Sizestr);
        int[]number =new int[size];
        System.out.println("Enter"+size+"number");
        for(int i =0;i<size;i++){
            number[i]=input.nextInt();
            userIntegers.add(number[i]);
        }
        Collections.sort(userIntegers);
        int Scenodlargest = userIntegers.get(userIntegers.size()-2);
        System.out.println("the Second largest number in Array is"+Scenodlargest);
        
            
        }
    }
