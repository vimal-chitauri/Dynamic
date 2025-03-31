package Graph2025;

import java.util.ArrayList;

public class noOfProvinces {

    public static void main(String[] args) {
        int[][] isConnected= new int[][]{{1,1,0},{1,0,0},{0,0,1}};
        System.out.println(findCircleNum1(isConnected));
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> givenAdj, int V) {
       // int V=givenAdj.size();
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            ArrayList<Integer> A = new ArrayList<>();
            adj.add(A);
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < givenAdj.get(0).size(); j++) {
                if (givenAdj.get(i).get(j) == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int vis[] = new int[V];
        int cnt=0;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i, adj, vis);
            }
        }
        return cnt;

    }

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis){
        vis[node] = 1;
        for (int i : adj.get(node)) {
            if (vis[i]==0) dfs(i, adj, vis);
        }
    }

    public static int findCircleNum1(int[][] isConnected) {
        int v= isConnected.length;

        ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
        for(int i=0; i<v;i++){
            adjList.add(new ArrayList<Integer>());
        }

        for(int i=0; i<v;i++){
            for(int j=0; j<isConnected[0].length;j++){
                adjList.get(i).add(j);
                adjList.get(j).add(i);
            }
        }

        int cnt=0;
        boolean[] visited = new boolean[v];
        for(int i=0; i<v;i++){
            if(!visited[i]){
                cnt++;
                dfs1(i,adjList,visited);
            }
        }
        return cnt;
    }

    public static void dfs1(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[node]=true;
        for(int i: adj.get(node)){
            if(!vis[i]){
                dfs1(i,adj,vis);
            }
        }
    }
}
