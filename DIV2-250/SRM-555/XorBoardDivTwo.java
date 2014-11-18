import java.util.*;

public class XorBoardDivTwo {

    public int theMax(String[] board) {
        int N = board.length;
        int M = board[0].length();
        
        char[][] brd = new char[N][M];
        for (int i = 0; i < N; i++)
            brd[i] = board[i].toCharArray();
        
        int res = 0; 
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                char[][] b = new char[N][M];
                for (int k = 0; k < N; k++)
                    b[k] = brd[k].clone();
                
                for (int k = 0; k < M; k++)
                    b[i][k] = (b[i][k] == '0') ? '1' : '0';
                
                for (int k = 0; k < N; k++)
                    b[k][j] = (b[k][j] == '0') ? '1' : '0';
                
                int count = 0;
                for (int n = 0; n < N; n++)
                    for (int m = 0; m < M; m++)
                        if (b[n][m] == '1') count++;
                
                res = Math.max(res, count);
            }
        
        return res;
    }

}