import java.util.*;

public class Egalitarianism {

    public int maxDifference(String[] isFriend, int d) {
        int N = isFriend.length;
        
        int[][] adj = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                adj[i][j] = (isFriend[i].charAt(j) == 'Y') ? 1 : 100;
        
        for (int k = 0; k < N; k++)  
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
        
        int max = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if (adj[i][j] == 100) return -1;
                if (i != j) max = Math.max(max, adj[i][j]);
            }
        
        return d * max;
    }

}