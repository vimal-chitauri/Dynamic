package Graph2025;

import java.util.ArrayList;
import java.util.List;

import static Graph2025.GraphBasicAdjMatrix.displayMatrix;

public class GraphBasicsAdjList {
    public static void main(String[] args) {
        List<List<Integer>> adjList= new ArrayList<>();
        for(int i=0; i<4; i++){
            adjList.add(new ArrayList<>());
        }


        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 1);
       // addEdge(adjList, 1, 2);
       // addEdge(adjList, 2, 3);
        printGraph(adjList);
    }

    public static void addEdge(List<List<Integer>> adj, int i, int j){
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    public static void printGraph(List<List<Integer>> adj){
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i+": ");
            for (Integer nodes: adj.get(i)){
                System.out.print(nodes+" ");
            }
            System.out.println();
        }
    }
}
