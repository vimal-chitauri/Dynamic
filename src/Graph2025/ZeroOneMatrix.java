package Graph2025;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public static void main(String[] args) {
        //row={-1,0,1,0}
        //col={0,1,0,-1}
        int[][] deletion= {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int[][] mat= new int[][]{{0,0,0},{0,1,0},{1,1,1}};

        int m=mat.length;
        int n=mat[0].length;
        int[][] resultMat= new int[m][n];
        Arrays.fill(resultMat,new int[]{0,0});
        Queue<int[]> queue= new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.add(new int[]{i,j});
                }else{
                    mat[i][j]=-1;
                }
            }
        }

        while(!queue.isEmpty()){
            int[] cell=queue.poll();
            int row=cell[0];
            int col=cell[1];

            for(int[] deletionArray : deletion){
                int newRow=row+deletionArray[0];
                int newCol= col+deletionArray[1];
                if(newRow>=0 && newRow<row && newCol>=0 && newCol<col && mat[newRow][newCol]>mat[newRow][newCol] + 1 ){
                    mat[newRow][newCol]=mat[row][col]+1;
                    queue.add(new int[]{newRow,newCol});
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("\n");
        }

    }
}
