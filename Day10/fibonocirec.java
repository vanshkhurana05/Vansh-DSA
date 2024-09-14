package Day10;

public class fibonocirec {
    static int fibonaci(int n){
        if(n==0||n==1) return n;
        int fib1=fibonaci(n-1);
        int fib2=fibonaci(n-2);
        return fib1+fib2;

    }
   
    public static void main(String[] args) {
   
    }
}
