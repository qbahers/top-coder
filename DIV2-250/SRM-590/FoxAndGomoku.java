import java.util.*;

public class FoxAndGomoku {

    public String win(String[] board) {
        int N = board.length;
        char[][] brd = new char[N][N];
        
        for (int i = 0; i < N; i++)
            brd[i] = board[i].toCharArray();
        
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int[][] delta = new int[][]{{1,0}, {0,1}, {1, 1}, {1, -1}};
                
                for (int k = 0; k < 4; k++) {
                    int cnt = 0;
                    int m = i;
                    int n = j;
                    do {
                        cnt = (brd[m][n] == 'o') ? cnt + 1 : 0;
                        if (cnt == 5) return "found";
                        m += delta[k][0];
                        n += delta[k][1];
                    } while (m < N && m >= 0 && n < N && n >= 0);
                }
            }
        }

        return "not found";
    }

}