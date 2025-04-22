package Recurssion;

import java.util.Arrays;

public class RevisionBinarySearchCons1s {

    public static void main(String[] args) {
        genrateBinarryNonCons1s(3);
    }

    private static void genrateBinarryNonCons1s(int k) {
        char[] charArray= new char[k];
        if(k==0){
            System.out.println(k);
        }
        charArray[0]='0';
        genrator(charArray,k,1);
        charArray[1]='1';
        genrator(charArray,k,1);
    }


    private static void genrator(char[] charArray, int sizeOfArray, int maxLimit) {
        if(maxLimit==sizeOfArray){
            System.out.print(Arrays.toString(charArray) +" ");
            return;
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
    }


}
