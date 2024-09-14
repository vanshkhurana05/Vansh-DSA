package Day10;

public class rec {
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        int x=n*fact(n-1);
        return x;
    }
    public static int poww(int a,int b){
        if(b==0) return 1;
        int x=a*poww(a, b-1);
        return x;
    }
    public static int factt(int n,int x){
        if(n==0 || n==1)  return x;
        return factt(n-1,n*x);
    }
    public static void main(String[] args) {
        System.out.println(factt(4,1));
    }
    
}
