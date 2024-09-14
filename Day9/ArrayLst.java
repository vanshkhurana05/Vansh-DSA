package Day9;
import java.util.ArrayList;
public class ArrayLst {
    public static ArrayList<Integer> maxsub(int[] arr,int k){
        int start=0;
        int end= k-1;
        int maxSum=0;
        for(int i=0;i<=end;i++)
            maxSum+=arr[i];
        int currSum=maxSum;
        int index= 0;
        while(end<arr.length-1){
            currSum-= arr[start];
            start++;
            end++;
            currSum+= arr[end];
            if(maxSum<currSum){
                index= start;
                maxSum= currSum;
            }
        }

        ArrayList<Integer> nums= new ArrayList<>();

        for(int i=index; i<index+k;i++){
            nums.add(arr[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
    int[] arr={10,20,30,40,10,20};
    System.out.println(maxsub(arr,2));
    }
}
