import java.util.*;

public class Fragile2 {
    private int N;
    private String[] graph;
    private boolean[] marked;
    private int[] pair = new int[]{-1, -1};

    public int countPairs(String[] graph) {
        this.N = graph.length;
        this.graph = graph;
        this.marked = new boolean[N];
        
        int cc = 0;
        for (int i = 0; i < N; i++) {
            if (!marked[i]) cc++;
            dfs(i);
        }
        
        int res = 0;
        for (int k = 0; k < N; k++) {
            for (int l = k + 1; l < N; l++) {
                marked = new boolean[N];
                pair = new int[]{k, l};
                
                int count = 0;
                for (int i = 0; i < N; i++) {
                    if (i == pair[0] || i == pair[1]) continue;
                    if (!marked[i]) count++;
                    dfs(i);
                }
                
                if (count > cc) res++;
            }
        }
        
        return res;
    }
    
    private void dfs(int i) {
        marked[i] = true;
        for (int j = 0; j < N; j++) {
            if (j == pair[0] || j == pair[1]) continue;
            if (!marked[j] && graph[i].charAt(j) == 'Y') dfs(j);
        }
    }

}