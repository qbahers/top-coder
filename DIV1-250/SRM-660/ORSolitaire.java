import java.util.*;

public class ORSolitaire {

    public int getMinimum(int[] numbers, int goal) {
        char[] g = Integer.toBinaryString(goal).toCharArray();
        int N = g.length;
        
        int[] a = new int[100];
        outer:
        for (int x : numbers) {
            char[] xx = Integer.toBinaryString(x).toCharArray();
            int M = xx.length;
            
            if (M > N) continue;
            
            for (int i = 0; i < M; i++)
                if (xx[i] == '1' && g[N - M + i] == '0') continue outer;
            
            for (int i = 0; i < M; i++)
                if (xx[i] == '1') a[M - 1 - i]++;
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++)
            if (g[i] == '1') min = Math.min(min, a[N - 1 - i]);
        
        return min;
    }

}