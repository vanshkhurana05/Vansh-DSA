package Day8;
import java.util.*;
//74 and 240
public class Array2D {
    static void populate(int[][] arr){
        int n=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=n;
                n++;
            }
        }
    }
    static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static int sum(int[][] arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                s+=arr[i][j];
            }
        }
        return s;
    }
    static int[] lsearch(int[][] arr,int n){
        int[] ans=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==n){
                    ans[0]=i;
                    ans[1]=j;
                   return ans;
                }
            }
        } 
        return ans;
    }
    static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
static void sortbyrow(int[][] arr){
    for(int i=0;i<arr.length;i++){
        Arrays.sort(arr[i]);
    }
}
static void sortbycol(int[][] arr){
    Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
}
static void compsort(int[][] arr){
    int[] nums=flaten(arr);
    Arrays.sort(nums);
    fillArray(arr, nums);
}
static void fillArray(int[][] nums, int[] arr){
    int cols= nums[0].length;
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            nums[i][j]=arr[cols*i + j];
        }
    }
}

static int[] flaten(int[][] arr){
    int rows=arr.length;
    int col=arr[0].length;
    int[] nums=new int[rows*col];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            nums[col*i+j]=arr[i][j];
        }
    }
    return nums;
}

    public static void main(String[] args) {
        // int[][] nums=new int[3][3];
        // populate(nums);
        // display(nums);
        // System.out.println();
        // transpose(nums);
        // display(nums);
        int[][] nums={
            {1,4,3},
            {9,6,7},
            {8,2,3}
        };
        compsort(nums);
        display(nums);

    }
}
