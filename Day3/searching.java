package Day3;
public class searching {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static boolean linearsearch(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
            }
         return false;
    }


    //binary search

    static boolean binarysearch(int[] arr,int n){
       int i=0,j=arr.length-1;
       while(i<=j){
        int mid=(i+j)/2;
        if(arr[mid]==n) return true;
        else if(arr[mid]<n) i=mid+1;
        else j=mid-1;
       }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       System.out.println(linearsearch(arr,5)); 
    }
    
}
