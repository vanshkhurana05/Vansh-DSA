package Day6;
public class BSSP {
    static boolean check(int speed,int dist,int time){
        int disttravelled=speed*time;
        if(disttravelled>=dist) return true;
        else return false;
    }
    static int reachcenter(int dist,int time){
        int lowspeed=0;
        int highspeed=200;
        int optimalspeed=-1;

        while(lowspeed<=highspeed){
            int mid=highspeed-(highspeed-lowspeed)/2;
            if(check(mid,dist,time)){
                optimalspeed=mid;
                highspeed=mid-1;
            }
            else{
                lowspeed=mid-1;
            }
            return optimalspeed;
       }
        return -1;
     
    }
public static void main(String[] args) {
    int distt=50;
    int tm=2;
    System.out.println(reachcenter(distt, tm));
}
}
