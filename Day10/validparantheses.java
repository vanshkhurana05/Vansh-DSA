package Day10;
//Q22
public class validparantheses {
    static void parantheses(int n,String ans,int l,int r){
        if(l==n && r==n){
            System.out.println(ans);
            return;
        }
        if(l<n){
            parantheses(n, ans+"{", l+1, r);
        }
        if(r<l){
            parantheses(n, ans+"}", l, r+1);
        }
    }
    public static void main(String[] args) {
        parantheses(3, "", 0, 0);
    }
}
