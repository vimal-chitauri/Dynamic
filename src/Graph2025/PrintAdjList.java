package Graph2025;

import java.util.ArrayList;
import java.util.List;

public class PrintAdjList {
    public static void main(String[] args) {
        int[][] array= new int[][]{{0,1}, {0,4}, {4,1}, {4,3}, {1,3}, {1,2}, {3,2}};
        printGraph(5,array);
    }

    public static List<List<Integer>> printGraph(int V, int edges[][]) {

        List<List<Integer>> result=new ArrayList<>();

        ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            result.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            for(int j=0; j<edges[0].length;j++){
                result.get(edges[i][0]).add(edges[0][j]);
                result.get(edges[0][j]).add(edges[i][0]);
            }
        }


        return result;



    }
}
