package Day4;

public class lowebound {
    static int lowerbound(int[] arr,int num){
        int firstocurrence=-1;
        int low=0,high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                firstocurrence=mid;
                high=mid-1;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return firstocurrence;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,3,4,5,6,7,8,9};
        int num=3;
        System.out.println(lowerbound(arr, num));
    }
    
}
