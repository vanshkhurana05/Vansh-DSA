package PatternsSelf;

public class Q14 {
    public static void main(String[] args) {
        
    int m=5;
        for(int i=1;i<=m;i++){
            for(int k=1;k<=m-i;k++){
              System.out.print("  ");
            }  
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
          }
    int n=4;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
