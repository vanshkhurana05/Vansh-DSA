package PatternsSelf;

public class Q17 {
    public static void main(String[] args) {
        int n=7;
        int a=(n+1)/2;
        for(int i=a-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=a-i;k++){
                System.out.print("  ");
            }
            for(int k=2;k<=a-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=a-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=2;k<=a-i;k++){
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