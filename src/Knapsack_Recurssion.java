
class Knapsack_Recurssion {

    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));
    }

    private static int knapsack(int w, int[] wt, int[] val, int n) {
        if(n==0||w==0)
            return 0;
        if(wt[n-1]<=w)
            return max(val[n-1]+knapsack(w-wt[n-1],wt,val,n-1),knapsack(w,wt,val,n-1));
        else
            return knapsack(w,wt,val,n-1);
    }

    private static int max(int a,int b) {
        return a>b?a:b;
    }
}
