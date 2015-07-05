import java.util.*;

public class MutaliskEasy {

    public int minimalAttacks(int[] x) {
        int N = x.length;
        
        int[] hp = new int[3];
        
        for (int i = 0; i < N; i++) {
            hp[i] = x[i];
        }
        
        int[][][] dp = new int[61][61][61];
        
        dp[0][0][0] = 0;
        
        int[][] a = new int[][] {
            {1, 3, 9}, {1, 9, 3}, {3, 1, 9}, 
            {3, 9, 1}, {9, 1, 3}, {9, 3, 1}
        };
          
        for (int i = 0; i <= hp[0]; i++) {
            for (int j = 0; j <= hp[1]; j++) {
                for (int k = 0; k <= hp[2]; k++) {
                    if (i == 0 && j == 0 && k == 0) continue;
                
                    int min = Integer.MAX_VALUE;
                    
                    for (int u = 0; u < 6; u++) {
                        int v1 = Math.max(0, i - a[u][0]);
                        int v2 = Math.max(0, j - a[u][1]);
                        int v3 = Math.max(0, k - a[u][2]);
                        
                        min = Math.min(min, dp[v1][v2][v3]);
                    }
            
                    dp[i][j][k] = 1 + min;
                }
            }
        }
        
        return dp[hp[0]][hp[1]][hp[2]];
    }

}