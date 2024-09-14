package Day7;

public class str {
    public static void main(String[] args) {
        //Q1
    // String s="potato";
    // for(int i=s.length()-1;i>=0;i--){
    //     System.out.print(s.charAt(i));
    // }


        //Q2
    //  String s="detartrated";
    //  String p="";
    //     for(int j=s.length()-1;j>=0;j--){
    //         p+=s.charAt(j);
    //     }
    //     System.out.println(s.equals(p));
        //Q3
    // String p="aaaabbbbbbcdd";
    // int countmaxelement=0;
    // char maxelement='*';
    // int countcurrelement=0;
    // int currelement='*';
    // for(int i=0;i<p.length();i++){
    //     if(p.charAt(i)!=currelement){
    //         if(countcurrelement>countmaxelement){
    //             countmaxelement=countcurrelement;
    //             maxelement=currelement;
    //         }
    //         currelement=s.charAt(i);
    //         countcurrelement=1;
    //     }
    //     else{
    //         countcurrelement++;
    //     }
    // }



       //Q4
    // String s="safafasssffasss";
    // int[] arr=new int[26];
    // for(int i=0;i<s.length();i++){
    //  arr[s.charAt(i)-'a']++;
    // }
    // int index=0;
    // for(int i=1;i<arr.length;i++){
    //     if(arr[index]<arr[i]){
    //         index=i;
    //     }
    // }
    // char ans=(char)('a'+index);
    // System.out.println(ans);



    
     //   Q5
    String s="the bird is flying";
    String s1="";
    String[] arr=s.split("\\s");
    for(int i=arr.length-1;i>=0;i--){
        s1+=arr[i]+" ";
    }
    System.out.println(s1);
      }
     }
