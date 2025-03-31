package dynamic2025.interval;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int newIntervalFirstElement=newInterval[0];
        int newIntervalSecondElement=newInterval[1];
        int end=0;
        int arrayCount=1;
        int[][] result = new int[arrayCount][];
        for(int i=0; i<=intervals.length;i++){
            int previous_list_end=intervals[i][1];
            if(newIntervalFirstElement <previous_list_end){
                result[arrayCount][1]=previous_list_end;
                result[arrayCount][0]=intervals[i][0];
                arrayCount++;
            }else{
                result[arrayCount][0]=intervals[i][0];
                result[arrayCount][1]=previous_list_end;
                arrayCount++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] interval = new int[][]{
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] newInterval= new int[]{2,5};
        insert(interval,newInterval);
    }
}
