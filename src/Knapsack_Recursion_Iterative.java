
public class Knapsack_Recursion_Iterative {
    public static void main(String[] args) {
        int[] val =new int[] { 60, 100, 120 };
        int[] wt =new int[] { 10, 20, 30 };
        int weight=90;
        int n=val.length;
        System.out.println(knapsack(val,wt,weight,n));
    }

    private static int knapsack_iterative(int[] val, int[] wt, int weight, int n,int[][] dp) {

        if(n==0||weight==0)
            return 0;
        if(dp[n][weight]!=-1)
            return dp[n][weight];
        if(wt[n-1]<=weight)
            return dp[n][weight]=max(val[n-1]+knapsack_iterative(val,wt,weight-wt[n-1],n-1,dp),
                    knapsack_iterative(val,wt,weight,n-1,dp));
        else
            return dp[n][weight]=knapsack_iterative(val,wt,weight,n-1,dp);
    }

    private static int knapsack(int[] val, int[] wt, int weight, int n){
        int[][] dp =new int[val.length+1][weight+1];
        for(int i = 0; i < n + 1; i++)
            for(int j = 0; j < weight + 1; j++)
                dp[i][j] = -1;
        return knapsack_iterative(val, wt, weight, n,dp);
    }

    private static int max(int a,int b) {
        return Math.max(a, b);
    }
}
