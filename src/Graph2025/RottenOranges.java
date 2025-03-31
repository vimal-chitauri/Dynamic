package Graph2025;

import jdk.internal.util.xml.impl.Pair;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class RottenOranges {

    public static void main(String[] args) {
        int[][] rottenOranges= new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(rottenOranges));
    }
    static class pair {
        int row;
        int col;
        int tm;
        pair(int row, int col, int tm){
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }
    public static int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m=grid[0].length;

        Queue<pair> queue= new LinkedList<>();
        int[][] vis= new int[n][m];
        int cntFresh=0;
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.add(new pair(i,j,0));
                    vis[i][j]=2;
                }else {
                    vis[i][j]=0;
                }if(grid[i][j]==1){
                    cntFresh++;
                }
            }
        }

        int tm=0;
        int[] drow= new int[]{-1, 0, +1, 0};
        int[] dcol= new int[]{0, +1, 0, -1};
        int cnt=0;

        while(!queue.isEmpty()){
            int r= queue.peek().row;
            int c= queue.peek().col;
            int t=queue.peek().tm;
            tm= Math.max(tm,t);
            queue.remove();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol= c+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    queue.add(new pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }

        }
        if(cnt!=cntFresh){
            return -1;
        }
        return tm;
    }


}
