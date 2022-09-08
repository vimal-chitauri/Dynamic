import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) throws ParseException {

        int[] number = {12, 7, 5, 1, 13, 1, 10, 8 ,11, 9, 2, 4, 3, 6};
      //
             int[] output=countSquares(number,number.length);
       // method(5);
    }

    static int[] countSquares(int[] arr,int n) {

        int output[] = new int[2];
        boolean[] tempArr = new boolean[n+1];
        Arrays.fill(tempArr, false);
        for(int i=0;i<n;++i){
            if(tempArr[arr[i]]==true){
                output[0]=arr[i];
                System.out.println(output[0]);
            }
            else{
                tempArr[arr[i]]=true;
            }
        }

        for(int i=1;i<=n;i++){
            if(tempArr[i]==false) {
                output[1] = i;
                break;
            }
        }
        System.out.println(output[1]);
        return output;
    }

    public static void method(int n){

        int i = n + 1;
        boolean arr[];
         arr = new boolean[]{false};
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
        //System.out.println(arr);

    }
}
