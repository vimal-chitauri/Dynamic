package dynamic2025;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
       // int finalResul=0;
        if(n<=1){
            return 1;
        }
        int result=climbStairs(n-2)+climbStairs(n-1);
        return result;
    }


}
