package Recurssion;

import java.util.Arrays;
import java.util.List;

public class ParentisisGenrator {
    private List<String> genrateBinarryNonCons1s(int k) {
        List<String> result;
        char[] charArray= new char[k];
        if(k==0){
            System.out.println(k);
        }
        charArray[0]='0';
        //result.add(genrator(charArray,k,1));
        charArray[1]='1';
      //  result.add(genrator(charArray,k,1));
        return null;

    }

    public static List<String> result;
    private static List<String> genrator(char[] charArray, int sizeOfArray, int maxLimit) {
        if(maxLimit==sizeOfArray){
           String str= Arrays.toString(charArray);
           result.add(str);
        }

        if(charArray[maxLimit-1]=='0'){
            charArray[maxLimit]='0';
            genrator(charArray,sizeOfArray,maxLimit+1);
            charArray[maxLimit]='1';
            genrator(charArray,sizeOfArray,maxLimit+1);
        }

        if(charArray[maxLimit-1]=='1'){
            charArray[maxLimit]='0';
            genrator(charArray,sizeOfArray,maxLimit+1);
        }
        return result;
    }
}
