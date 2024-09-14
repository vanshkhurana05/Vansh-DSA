package Day5;

public class NGE{
    static void NSEL(int[] arr){
         
         int maxelement=0;
        int[] ngel=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){ 
            ngel[i]=maxelement;
            maxelement=Math.max(maxelement,arr[i]);
        }
        for(int i=0;i<=ngel.length-1;i++){
             System.out.print(ngel[i]);
        }
    }
    static void NSER(int[] arr){
         
        int maxelement=0;
       int[] nger=new int[arr.length];
       for(int i=arr.length-1;i>=0;i--){ 
           nger[i]=maxelement;
           maxelement=Math.max(maxelement,arr[i]);
       }
       for(int i=0;i<=nger.length-1;i++){
            System.out.print(nger[i]);
       }
   }
    public static void main(String[] args) {
       int[] arr={3,7,2,5,8,4,9,1,6};
       NSEL(arr);
       System.out.println();
       NSER(arr);
    }
}
