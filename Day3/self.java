package Day3;

import java.util.Scanner;

public class self {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int minfar=sc.nextInt();
        int maxfar=sc.nextInt();
        int step=sc.nextInt();
        for(int i=minfar;i<=maxfar;i=i+step){
            int c=(i-32)*(5/9);
            System.out.println(i+" "+c);
            sc.close();
        }
    }
    
}
