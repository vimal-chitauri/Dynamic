package Graph2025;

import java.util.*;

public class BFSTraversal {
    public static void main(String[] args) {

        // create the adjacency list
        // { {2, 3, 1}, {0}, {0, 4}, {0}, {2} }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(2)));

        int src = 0;
        ArrayList<Integer> ans = bfsOfGraph(adj, src);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int src) {
        ArrayList<Integer> res= new ArrayList<>();
        Queue<Integer> queue= new LinkedList<>();
        boolean[] visited= new boolean[adj.size()];
        visited[src]=true;
        queue.add(src);

        while(!queue.isEmpty()){
            int curr= queue.poll();
            res.add(curr);

            for(int node: adj.get(curr)){
                if(!visited[node]){
                    visited[node]=true;
                    queue.add(node);
                }
            }


        }
        return res;

    }
}
