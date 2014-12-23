import java.util.*;

public class ArcadeManao {
    private boolean[][] marked;
    private char[][] lvl;
    private int L = 0;
    private int N, M;

    public int shortestLadder(String[] level, int coinRow, int coinColumn) {
        N = level.length;
        M = level[0].length();
        
        lvl = new char[N][M];
        for (int i = 0; i < N; i++)
            lvl[i] = level[i].toCharArray();
        
        while (L < 51) {
            marked = new boolean[N][M];
            dfs(N - 1, 0);
            if (marked[coinRow - 1][coinColumn - 1]) return L;
            L++;
        }
        
        return -1;
    }

    private void dfs(int i, int j) {
        marked[i][j] = true;
        
        if (j + 1 < M  && lvl[i][j + 1] == 'X' && !marked[i][j + 1])
            dfs(i, j + 1);
        
        if (j - 1 >= 0 && lvl[i][j - 1] == 'X' && !marked[i][j - 1]) 
            dfs(i, j - 1);
        
        for (int k = -L; k <= L; k++)
            if (i + k >= 0 && i + k < N && lvl[i + k][j] == 'X' && !marked[i + k][j])
                dfs(i + k, j);
    }

}