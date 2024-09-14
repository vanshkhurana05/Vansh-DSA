package Day10;

public class subsequencesrec {
    static void subsequences(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        subsequences(ques.substring(1), ans+ques.charAt(0));
        subsequences(ques.substring(1), ans);
    }


    
    static int countsubsequences(String ques){
        return 1;
    }
    public static void main(String[] args) {
        
    }
}
