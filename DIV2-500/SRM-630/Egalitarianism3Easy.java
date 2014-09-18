import java.util.*;

public class Egalitarianism3Easy {

    public int maxCities(int n, int[] a, int[] b, int[] len) {
        int[][] adj = new int[n+1][n+1];
        
        for (int i = 0; i < n - 1; i++) {
            adj[a[i]][b[i]] = len[i];
            adj[b[i]][a[i]] = len[i];
        }
        
        Set<Set<Integer>> powerSet = powerSet(n);
        
        int k = 0;
        outerloop:
        for(Set<Integer> subset : powerSet) {
            int distance = 0;
            for (Integer u : subset) {
                for (Integer v :subset) {
                    if (u == v) continue;
                        
                    if (distance == 0) {
                        distance = distance(n, u, v, adj);
                    }
                    
                    if (distance(n, u, v, adj) != distance) continue outerloop;
                }
            }
            if (subset.size() > k) k = subset.size();
        }
        
        return k;
    }
    
    private Set<Set<Integer>> powerSet(int n) {
        Set<Set<Integer>> powerSet = new HashSet<Set<Integer>>();
                    
        for (int i = 0; i < Math.pow(2, n); i++) {  
            Set<Integer> subset = new HashSet<Integer>();
            
            String binaryString = Integer.toBinaryString(i);
            
            while(binaryString.length() < n) binaryString = "0" + binaryString;
            
            for (int j = 0; j < n; j++) {
                if (binaryString.charAt(j) == '1') {
                    subset.add(j + 1);
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }
    
    private int distance(int n, int u, int v, int[][] adj) {
        boolean[] marked = new boolean[n+1];
        int[] edgeTo = new int[n+1];
        
        dfs(n, u, marked, edgeTo, adj);
        
        if (edgeTo[v] == 0) return -1;
        
        int dist = 0;
        while (v != u) {
            dist += adj[edgeTo[v]][v];
            v = edgeTo[v];
        }
        
        return dist;
    }
    
    private void dfs(int n, int u, boolean[] marked, int[] edgeTo, int[][] adj) {
        marked[u] = true;
        
        for (int v = 1; v <= n; v++) {
            if (adj[u][v] == 0) continue;
            if (!marked[v]) {
                dfs(n, v, marked, edgeTo, adj);
                edgeTo[v] = u;
            }
        }   
    }

}
