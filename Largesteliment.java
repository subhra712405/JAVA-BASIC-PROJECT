import java.util.ArrayList;

public class Largesteliment {
    public static void main (String[]args) {
        ArrayList<Integer> list = new  ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(90);
        list.add(3);
        int max = list.get(0);
        for(int i=1;i<list.size();i++){
            int number = list.get(i);
            if (number>max){
                max=number ;

            }
        }
    System.out.println(max);
    
    }       
    }
