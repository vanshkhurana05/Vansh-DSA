package PatternsSelf;

public class Q15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
           for(int k=1;k<=n-i;k++){
            System.out.print("    ");
           }
           for(int j=1;j<=i;j++){
            System.out.print("* ");
           }
           System.out.println();
        }
        int m=5;
        for(int i=2;i<=m;i++){
             for(int k=1;k<=m-i;k++){
             System.out.print("    ");
            }
            for(int j=1;j<=i;j++){
             System.out.print("* ");
            }
             System.out.println();
        }
         }
    }
