package Day7;

public class pra {
    public static void main(String[] args) {
        int count=0;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                count++;
            }
        }
        System.out.println(count);
    }
}

//news.ycombinator.com
// ycombinator