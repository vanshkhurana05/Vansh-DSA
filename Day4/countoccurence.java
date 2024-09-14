package Day4;

public class countoccurence {
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
    static int upperbound(int[] arr,int num){
        int ans=-1;
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==num){
     ans=mid+1;
     low=mid+1;
            }
            else if(arr[mid]>num){
                high=mid-1;
            }
            
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    static int countoccurences(int[] arr,int num){
    int lb=lowerbound(arr,num);
     if(lb==-1) return -1;
    int ub=upperbound(arr,num);
    return ub-lb;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,6,6,6,6,7,8,9,9,9,9};
        int num=5;
        System.out.println(countoccurences(arr,num));
    }
}
