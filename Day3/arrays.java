package Day3;

public class arrays {
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int sumArr(int[] arr){
        int a=1;
        int b=4;
        if(a>b||a<0||b<0||b>=arr.length){
            return 0;
        }
      int sum=0;
      for(int i:arr){
        sum+=i;
      }
      return sum;
    }
    static void reversearr(int[] arr){
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
          temp[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        

    }
    static void swap(int[] arr,int i,int j){
        
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseusingswaptill(int[] arr){
        int a=1;
        int b=4;
       for(int i=a,j=b;i<j;j--,i++){
        swap(arr,i,j);
       }

    }
    static void reverseusingswap(int[] arr){
        
       for(int i=0,j=arr.length-1;i<j;j--,i++){
        swap(arr,i,j);
       }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseusingswap(arr);
        printArr(arr);

    }
}
