package sorting;


import java.util.Arrays;

public class MergeSortRevision {
    public static void main(String[] args) {
        int[] arr= new int[]{1,3,2,3,1};
      //  mergeSortRevision(arr,0,arr.length-1);
       // Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
        System.out.println( mergeSortRevision(arr,0,arr.length-1));
    }

    private static int mergeSortRevision(int[] arr, int low, int high) {
        int count=0;
        if(low<high){
            int m=(low+high)/2;
            count+=mergeSortRevision(arr,low,m);
            count+=mergeSortRevision(arr,m+1,high);
            count+=countReversePair(arr,low,m,high);
            mergeRevision(arr,low, m, high);
        }
        return count;
    }

    private static int countReversePair(int[] arr, int low, int m, int high) {
        int right= m+1;
        int count=0;
        for(int i=low;i<=m;i++){
            while(right<=high && arr[i]> 2* arr[right]) right++;
            count+=(right-(m+1));
        }
        return count;
    }


    private static void mergeRevision(int[] arr, int low, int m, int high){
         int leftN= m-low+1; //coz it start from zero
         int rightN= high-m;

        int[] leftArr= new int[leftN];
        int[] rightArr= new int[rightN];

        for(int i=0; i<leftN; i++){
            leftArr[i]=arr[low+i];
        }

        for(int j=0; j<rightN;j++){
            rightArr[j]=arr[m+1+j];
        }
        int i=0, j=0, k=low;
        while(i<leftN && j<rightN){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }

        while(i<leftN){
            arr[k]=leftArr[i];
            i++;
            k++;
        }

        while(j<rightN){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
}
