package Recurssion;

public class AtoiTwo {

    public static void main(String[] args) {
        String str="   -042";
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()) return 0;
        char[] str=s.toCharArray();
        int i=0, sign=1;
        if(str[i]=='-'){
            sign = -1;
            i++;
        }else if(str[i]=='+'){
            i++;
        }

        return atoiFun(str, i, sign, 0);

    }

    public static int atoiFun(char[] str, int i, int sign, int result){

        if(i==str.length || !isDigit(str[i])){
            return (int) result*sign;
        }
        result = (result * 10) + (str[i] - '0');

        return atoiFun(str, i+1, sign, result);

    }

    public static boolean isDigit(char ch){
        return ch>='0' && ch<='9';
    }


    public static int myAtoi1(String s) {
        int result=0;
        boolean sign=false;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='-'){
                sign=true;
                break;
            }
        }

        result=funRecursive( s, 0,result);
        if(sign){
            result=-1*result;
        }
        return result;
    }

    public static int funRecursive(String s, int index, int result){
        if(index==s.length()){
            return result;
        }

        result=(result*10) + s.charAt(index)-'0';
       return funRecursive(s, index+1,result );

    }
    public static boolean funIsDigitIsNotPresent(char ch){
        return ch>='0' && ch<='9';
    }
}
