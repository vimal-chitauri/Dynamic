package dynamic2025;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr= new int[]{10,20,30,10};

        int[] dp= new int[arr.length];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for (int i = 1; i < arr.length; i++) {
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne= dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            if(i>1)
                 jumpTwo = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);

            dp[i]=Math.min(jumpOne,jumpTwo);
        }
        System.out.println(dp[arr.length-1]);

      //  Integer.MAX_VALUE

    }



}
