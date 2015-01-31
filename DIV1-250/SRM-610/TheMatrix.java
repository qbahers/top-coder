import java.util.*;

public class TheMatrix {
    private String[] board;

    public int MaxArea(String[] board) {
        this.board = board;
        
        int N = board.length;
        int M = board[0].length();
    
        int res = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                int width = Integer.MAX_VALUE;
                int height = 0;
                
                int c = rightColor(0, i, j) ? 0 : 1;
                
                int k = i, l = j;
                while (k < N && rightColor(c, k, j)) {
                    l = j + 1;
                    while (l < M && rightColor(c, k, l)) l++;
                    width = Math.min(width, l - j);
                    res = Math.max(res, width * (k - i + 1));
                    k++;
                }
            }
        
        return res;
    }
    
    private boolean rightColor(int color, int x, int y) {
        return (x + y + color) % 2 == board[x].charAt(y) - '0';
    }

}