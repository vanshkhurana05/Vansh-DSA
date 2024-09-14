package PatternsSelf;

public class Q11 {
    public static void main(String[] args) {
  /*
   
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++){ 
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*   ");
        }
        System.out.println();
      
    } 
  
  */ 


  int n=5;
  for(int i=1;i<=n;i++){
      for(int k=1;k<=n-i;k++){
          System.out.print("  ");
      }
      for(int j=1;j<= 2*i-1;j++){
        if(j%2==0){
            System.out.print("  ");
        }
        else{
            System.out.print("* ");
        }
          
      }
      System.out.println();
  }
    }
    
    
}
