import java.util.*;

public class FoxAndGo {
    private int N;
    private int ccSize;
    private boolean[][] marked;
    private boolean isKilled = true;

    public int maxKill(String[] board) {
        N = board.length;
        char[][] brd = new char[N][N];
        for (int i = 0; i < N; i++)
            brd[i] = board[i].toCharArray();

        int maxScore = 0;
        for (int k = 0; k < N; k++)
            for (int l = 0; l < N; l++)
                if (brd[k][l] == '.') {
                    brd[k][l] = 'x';
                
                    marked = new boolean[N][N];
                    int score = 0;
                    for (int i = 0; i < N; i++)
                        for (int j = 0; j < N; j++) {
                            if (brd[i][j] == 'o' && !marked[i][j]) dfs(brd, i, j);
                            if (isKilled) score += ccSize;
                            ccSize = 0;
                            isKilled = true;
                        }
                    maxScore = Math.max(maxScore, score);
                    brd[k][l] = '.';
                }

        return maxScore;                
    }
    
    private void dfs(char[][] brd, int i, int j) {
        marked[i][j] = true;
        ccSize++;
        
        int[][] delta = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; 
        for (int k = 0; k < 4; k++) {
            int ii = i + delta[k][0];
            int jj = j + delta[k][1];
            if (ii >= 0 && ii < N && jj >= 0 && jj < N) {
                if (brd[ii][jj] == '.') isKilled = false;
                if (brd[ii][jj] == 'o' && !marked[ii][jj]) dfs(brd, ii, jj);
            }
        }
    }

}