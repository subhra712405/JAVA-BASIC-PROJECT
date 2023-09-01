import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        System.out.println("Enter the size of array.....  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];// declaration and instantiation
        System.out.println("\nEnter the eliment of array");
        for (int i = 0; i < a.length; i++){
            
        
        String userinput = input.next();
        a[i] = Integer.parseInt(userinput);}

        System.out.println("\nThe Array is ");
            

        // traversing array
        for (int i = 0; i < a.length; i++)// length is the property of array

            
            System.out.println("index"+i+":"+a[i]);
            System.out.println("\nEnter index to show eliment  ");
            int userinput2=input.nextInt();
            System.out.println("desire index is Holding "+a[userinput2]);

    }
}
