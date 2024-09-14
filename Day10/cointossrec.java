package Day10;

public class cointossrec {
    static void cointtoss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        cointtoss(n-1, ans+"H");
        cointtoss(n-1, ans+"T");
    }
    static int countcointoss(int n){
        if(n==0){
            return 1;
        }
        int l=countcointoss(n-1);
        int r=countcointoss(n-1);
        return l+r;
    }

    public static void main(String[] args) {
       System.out.println(countcointoss(3));
    }
}
