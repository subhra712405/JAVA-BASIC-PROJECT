import java.util.Random;

public class Randomnumber {
    public static void main(String[]args){
        Random random =new Random();
        int randomnumber = random.nextInt(100)+1;
        System.out.println("the Random number is "+randomnumber);
    }
}

