package PatternsSelf;

public class Q20 {
    public static void main(String[] args) {
        int n=7;
        int a=(n+1)/2;
        for(int i=1;i<=a;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        for(int i=a-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
}