package PatternsSelf;

public class Q19 {
    public static void main(String[] args) {
        int n=7;
        int a=(n+1)/2;
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=a-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=a-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=a-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=a-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
