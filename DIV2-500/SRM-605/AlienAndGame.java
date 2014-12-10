import java.util.*;

public class AlienAndGame {

    public int getNumber(String[] board) {
        int M = board.length;
        int N = board[0].length();
        
        char[][] brd = new char[M][N];
        for (int i = 0; i < M; i++)
            brd[i] = board[i].toCharArray();
        
        int maxArea = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int k = 0;
                while (i + k < M && j + k < N && isStriped(brd, i, j, k)) {
                    maxArea = Math.max(maxArea, (k + 1) * (k + 1));
                    k++;
                }
            }
        }
        
        return maxArea;
    }
    
    private boolean isStriped(char[][] brd, int i, int j, int k) {
        for (int m = i; m <= i + k; m++) {
            Set<Character> colors = new HashSet<Character>();
            for (int n = j; n <= j + k; n++) {
                colors.add(brd[m][n]);
            }
            if (colors.size() > 1) return false;
        }
        return true;
    }

}