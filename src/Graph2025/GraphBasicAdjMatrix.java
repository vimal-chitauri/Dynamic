package Graph2025;

public class GraphBasicAdjMatrix {

    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        addEdge(mat, 0, 1);
        addEdge(mat, 0, 2);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 3);
        displayMatrix(mat);
    }
    public static void addEdge(int[][] mat, int i, int j) {
        mat[i][j] = 1;
        mat[j][i] = 1; // Since the graph is undirected
    }

    public static void displayMatrix(int[][] mat) {

        System.out.println("first view ");
         for(int i=0 ; i<=mat.length-1; i++){
             for(int j=0 ;j<=mat.length-1; j++ ){
                 System.out.print(mat[i][j]+" ");
             }
             System.out.print("\n");
         }


        System.out.println("second view ");
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}
