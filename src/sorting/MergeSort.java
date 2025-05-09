package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= new int[]{5,7,2,8,11,20,25,30,1};
        mergeSort(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void mergeSort(int[] arr, int low, int high) {
       if(low<high) {
           int mid = (low + high) / 2;
           mergeSort(arr, low, mid);
           mergeSort(arr, mid + 1, high);
           merge(arr,low,mid,high);
       }
    }

    private static void merge(int[] arr, int low, int mid, int high){
        int leftN=mid-low+1;
        int rightN=high-mid;
       int[] leftArray= new int[leftN];
       int[] rightArray=new int[rightN];

        for(int i=0;i<leftN;i++){
            leftArray[i]=arr[low+i];
        }

        for (int j = 0; j < rightN; j++) {
            rightArray[j]=arr[mid+1+j];

        }

        int i=0, j=0;
        int k=low;
        while(i<leftN && j<rightN){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }

        while(i<leftN){
            arr[k]=leftArray[i];
            i++;
            k++;
        }

        while(j<rightN){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }

}
