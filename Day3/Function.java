package Day3;



public class Function {
    static void nat(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
static void swap(int a, int b){
  int c=a;
    a=b;
    b=c;
    System.out.println(a);
    System.out.println(b);
}
static void prime(int n){
    int count=0;
    for(int i=2;i<n;i++){
        if(n%i==0){
        count++;
    }
    }
        if(count>=1){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
        /*
         if(n%i==0) return false;
         return true;
         */
}
static int reverse(int n){
    int temp=0;
           while(n!=0){
            temp=temp*10+n%10;
            n/=10;
           }
           return temp;
}
static int countnum(int n){
    int count=0;
    while(n!=0){
        if(n%10!=0){
            count++;
        }  
        n/=10;
    }

    return count;
}
static void armstrong(int n){
    int temp=n;
    int sum=0;
    int a=countnum(n);
   while(n!=0){
        sum+=Math.pow(n%10,a);
        n/=10;
   }
   if(temp==sum){
    System.out.println("true");
   }
   else{
    System.out.println("false");
   }
    
}

    public static void main(String[] args) {
        int n=371;
        armstrong(n);
    }
   
} 
