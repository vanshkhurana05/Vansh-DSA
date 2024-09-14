package PatternsSelf;

public class Q25 {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(num+"\t");
                num++;
            }
             System.out.println();
        }
      
    
       
    }
    
}
