package Recurssion;

public class pow {
    public static void main(String[] args) {
        System.out.println(myPow1(2.0000,-2));
    }

    public static double myPow1(double x, int n) {
        double result;
        if(n==0) return 1;
        if(n<=-1){
            result=1/x*myPow1(x,n+1);
        }else{
            result=x*myPow1(x,n-1);
        }

        return result;
    }
    public static double myPower(double x, long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1.0/myPower(x,-n);
        }

        if (n % 2 == 1) {
            return x * myPower(x * x, (n - 1) / 2);
        } else {
            return myPower(x * x, n / 2);
        }


    }

    public double myPow(double x, int n) {
        // double result=0;

        if(n==0) return 1;
        if(n<=-1){
             x=1/myPow(x*x, n+1);
        }else{
            x= myPow(x*x, n-1);
        }
        return x;

    }
}
