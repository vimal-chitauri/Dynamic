package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= new int[]{50,20,40,60,10,30};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length-1;i++){
            int min_item=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>min_item){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min_item;
        }
    }

    private static void mergeSort(int[] arr,int startIndex, int endIndex){
        //50,20,40,60,10,30

        //  50,20,40  -> first   ->> 20,50,40 ->            first_second
        //  60,10,30  -> second


    }
}
