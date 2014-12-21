import java.util.*;

public class GooseInZooDivTwo {
    private boolean[][] marked;
    private char[][] fld;
    private int count;
    private int M, N;
    private int dst;
    
    public int count(String[] field, int dist) {
        dst = dist;
        M = field.length;
        N = field[0].length();
        marked = new boolean[M][N];
        
        fld = new char[M][N];
        for (int i = 0; i < M; i++)
            fld[i] = field[i].toCharArray();
        
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (fld[i][j] == 'v' && !marked[i][j]) {
                    dfs(i, j);
                    count++;
                }
            
        int res = 1;
        for (int i = 0; i < count; i++)
            res = res * 2 % 1000000007;
            
        return res - 1;
    }
    
    private void dfs(int i, int j) {
        marked[i][j] = true;
        for (int k = i - dst; k <= i + dst; k++)
            for (int l = j - dst; l <= j + dst; l++)
                if (k >= 0 && k < M && l >= 0 && l < N && 
                    fld[k][l] == 'v' && !marked[k][l] &&
                    Math.abs(i - k) + Math.abs(j - l) <= dst) 
                        dfs(k, l);
    }

}