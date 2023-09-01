public class Linear{
    public static int leniarsearch(int[] number,int n){
        for(int i=0;i<array.Length();i++){
            if(number[i]==n){
                return i;
            }
            return -i;
        }
    }
    public static void main (String[]args){
        int[] number={20,34,67,4,3,5};
        int n = 20 ;

        int index = leniarsearch(number, n);

        if(index!=-1){
            System.out.println("Target found at"+index);
        }else{
            System.out.println("not found :");
        }
    }
}
