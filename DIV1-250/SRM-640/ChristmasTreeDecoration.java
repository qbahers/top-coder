import java.util.*;

public class ChristmasTreeDecoration {

    public int solve(int[] col, int[] x, int[] y) {
        int N = col.length;
        int M = x.length;
        
        QuickUnionUF uf = new QuickUnionUF(N);
        
        int res = N - 1;
        for (int i = 0; i < M; i++) {
            int u = x[i] - 1;
            int v = y[i] - 1;
            if (col[u] != col[v] && !uf.connected(u, v)) {
                uf.union(u, v);
                res--;
            }
        }
        
        return res;
    }

}

class QuickUnionUF {
    private int[] id;
    
    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }
    
    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}