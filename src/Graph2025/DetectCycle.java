package Graph2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycle {
    public static void main(String[] args) {
    int[][] array= new int[][]{{1}, {0,2,4}, {1,3}, {2,4}, {1,3}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = 5;
        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
            adj.add(list);
        }

        isCycle(adj);
    }
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int V= adj.size();
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);

        for(int i=0; i<V;i++){
            if(!vis[i]){
                if(checkForCycle(i,V,adj,vis)) return true;
            }
        }
        return false;
    }

    public static boolean checkForCycle(int src, int V,
                                 ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src]=true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));

        while(!q.isEmpty()){
            int node=q.peek().src;
            int parent=q.peek().parent;
            q.remove();

            for(int adjNode: adj.get(node)){
                if(vis[adjNode]==false){
                    vis[adjNode]=true;
                    q.add(new Pair(adjNode,node));
                }else if(parent!=adjNode){
                    return true;
                }
            }
        }
        return false;
    }
    static class Pair{

        int src;
        int parent;

        public Pair(int src, int previousNode){
            this.src=src;
            this.parent=previousNode;
        }
    }

}
