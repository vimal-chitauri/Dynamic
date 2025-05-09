package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= new int[]{5,10,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }

        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void swap(int a, int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
