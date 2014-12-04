import java.util.*;

public class PathGameDiv2 {

    public int calc(String[] board) {
        int N = board[0].length();
        
        int k = 0, l = 0;
        while (k < N && board[0].charAt(k) == '.') k++;
        while (l < N && board[1].charAt(l) == '.') l++;
        int m = Math.max(k, l);
        int i = (m == k) ? 0 : 1;
        
        int res = 0;
        for (int j = 0; j < m; j++)
            if (board[(i + 1) % 2].charAt(j) == '.') res++;
        
        if (m == N) return res;
        else {
            i = (i + 1) % 2;
            res--;
            int j = m;
            while (j < N) {
                if (board[i].charAt(j) == '.') {
                    if (board[(i + 1) % 2].charAt(j) == '.') res++;
                }
                else {
                    i = (i + 1) % 2;
                    res--;
                }
                j++;
            }
            
            return res;
        }
    }

}