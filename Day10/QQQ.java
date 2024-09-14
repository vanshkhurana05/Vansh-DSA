package Day10;

public class QQQ {
    static void prem(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            prem(s1+s2,"");
        }
    }
    public static void main(String[] args) {
        prem("abc","");
    }
}
