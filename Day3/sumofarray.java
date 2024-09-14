package Day3;
import java.util.*;

public class sumofarray {
    public static void main(String[] args) {
        // sum of array
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
         int[] arr=new int[size];
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         
         for(int i=0;i<size;i++){
            sum+=arr[i];
         }
         System.out.println(sum);
         sc.close();
    }
    
}
