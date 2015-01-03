import java.util.*;

public class PastingPaintingDivTwo {

    public long countColors(String[] clipboard, int T) {
        int N = clipboard.length;
        int M = clipboard[0].length();
        
        int min = Math.min(N, M);
        
        long[] a = new long[min + 1];
        
        char[][] canvas = new char[N + min][M + min];
        for (int k = 0; k < min; k++) {
            for (int i = 0; i < N; i++)
                for (int j = 0; j < M; j++)
                    if (clipboard[i].charAt(j) == 'B')
                        canvas[i + k][j + k] = 'B';
            
            int count = 0;
            for (int i = 0; i < N + min; i++)
                for (int j = 0; j < M + min; j++)
                    if (canvas[i][j] == 'B') count++;
            
            a[k + 1] = count;
        }
        
        for (int i = min; i >= 1; i--)
            a[i] -= a[i - 1];
        
        long res = 0;
        for (int t = 1; t <= Math.min(min, T); t++)
            res += a[t];
        
        return res + Math.max(0, T - min) * a[min];
    }

}