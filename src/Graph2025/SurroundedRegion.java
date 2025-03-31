package Graph2025;

import java.util.Arrays;

public class SurroundedRegion {
    public static void main(String[] args) {
       // int[][] mat= new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};\
        int[][] mat= new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        System.out.println( numEnclaves(mat));
    }

    public static int numEnclaves(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        int[][] vis= new int[m][n];
        int finalResult = 0;



        //rows- first and last traversal
        // m -> rows no.
        for(int i=0;i<m;i++){
            if(vis[0][i]==0 && mat[0][i]==1) {
                dfs(0, i, vis, mat, delRow, delCol);
            }
            if(vis[m-1][i]==0 && mat[m-1][i]==1) {
                dfs(m - 1, i, vis, mat, delRow, delCol);
            }
        }

        //col- fist  and last traversal
        // n-> col. no
        for(int i=0;i<n;i++){
            if(vis[i][0]==0 && mat[i][0]==1) {
                dfs(i, 0, vis, mat, delRow, delCol);
            }

            if(vis[n-1][0]==0 && mat[n-1][0]==1) {
                dfs(n - 1, 0, vis, mat, delRow, delCol);
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(vis[i][j]+" ");
                /*if(vis[i][j]==0 && mat[i][j]==1){
                    finalResult++;
                }*/

            }
            System.out.print("\n");

        }
        return finalResult;

    }

    public static void dfs(int row, int col, int[][] vis, int[][] mat, int[] delRow, int[] delCol){
        vis[row][col]=1;
        int m=mat.length;
        int n=mat[0].length;
       // System.out.println("for row "+row +"for col "+col);

        for(int i=0; i<4;i++){
            int newRow=row+delRow[i];
            int newCol= col+delCol[i];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n &&
                    vis[newRow][newCol]==1 && mat[newRow][newCol]=='1'){
                dfs(newRow,newCol,vis,mat,delRow,delCol);
            }
        }



    }

}
