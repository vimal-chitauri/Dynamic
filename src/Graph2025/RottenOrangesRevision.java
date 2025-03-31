package Graph2025;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrangesRevision {

    public static void main(String[] args) {
        int[][] rottenOranges= new int[][]{{1,2}};
        System.out.println(orangesRotting(rottenOranges));
    }
    public static int orangesRotting(int[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int[][] visited = new int[m][n];
        int cntFresh=0;

        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1){
                    cntFresh++;
                }

            }
        }
        int tm=0;
        int[] drow=new int[]{-1,0,+1,0};
        int[] dcol= new int[]{0,+1,0,-1};
        int cnt=0;

        while(!queue.isEmpty()){
            int row= queue.peek().row;
            int col= queue.peek().col;
            int t= queue.peek().t;
            tm= Math.max(t,tm);
            queue.remove();

            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol]==0 &&
                        grid[nrow][ncol]==1) {
                    queue.add(new Pair(nrow, ncol, t + 1));
                    visited[nrow][ncol] = 2;
                    cnt++;
                }
            }

        }
        return tm;




    }
    static class Pair{
        int row;
        int col;
        int t;
        public Pair(int row, int col, int t){
            this.row=row;
            this.col=col;
            this.t=t;
        }
    }
}
