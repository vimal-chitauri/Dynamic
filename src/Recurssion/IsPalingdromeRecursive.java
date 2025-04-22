package Recurssion;

public class IsPalingdromeRecursive {
    public static void main(String[] args) {
        String str="NITIN";
        char[] array= str.toCharArray();
        System.out.println(function(array,0,str.length()-1));
    }

    public static boolean function(char[] str, int s, int e){
        if(s>e || s==e){
            return true;
        }
        if(str[s]!=str[e]){
            return false;
        }

        return function(str,s+1,e-1);
    }
}
