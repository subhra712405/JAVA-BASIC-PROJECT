import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avargereduce{
    public static void main(String[]args){
        List<Integer>mylist=new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number in list(Enter'quit'to Exit)");
        while (true) {
            String userinput = input.nextLine();
            if(userinput.equalsIgnoreCase("quit")){
                break ;
            }
            int userinput2=Integer.parseInt(userinput);
            mylist.add(userinput2);

            
        }
        // int mylist2=Integer.parseInt(mylist);
        int sum=0;
        for(int number:mylist){
            // System.out.println(number);
                sum+=number;
        }
        
        // for(int number:mylist){
            

        
        System.out.println("sum"+sum);
        System.out.println("Avrage is"+(double)sum/mylist.size());
        


    }

    }
