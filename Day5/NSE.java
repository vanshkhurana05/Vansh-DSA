package Day5;

public class NSE {
    static void NSER(int[] arr){
      int[] nser=new int[arr.length];
      int minelement=Integer.MAX_VALUE;
      for(int i=arr.length-1;i>=0;i--){
        if(minelement==Integer.MAX_VALUE) nser[i]=0;
       else nser[i]=minelement;
        minelement=Math.min(minelement,arr[i]);
      }
      for(int i=0;i<=nser.length-1;i++){
        System.out.print(nser[i]);
   }
    }
    public static void main(String[] args) {
        int[] arr={3,7,2,5,8,4,9,1,6};
        NSER(arr);
        System.out.println();
        
    }
    
}
