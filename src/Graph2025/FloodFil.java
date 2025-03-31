package Graph2025;

public class FloodFil {
    public static void main(String[] args) {
        int[][] adjMat= new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        floodFill(adjMat,1,1,2);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor= color;
        int[][] ans=image;
        int[] delRow=new int[]{-1,0,+1,0};
        int[] delCol=new int[]{0,+1,0,-1};
        dfs(sr,sc,ans,image,color,delRow,delCol,iniColor);
        return ans;
    }

    public static void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int[] delRow, int[] delCol,
                           int initColor){
        ans[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;

        for (int i = 0; i < 4; i++) {
            int nRow= row+delRow[i];
            int nCol= col+delCol[i];


        }
    }
}
