import java.util.*;

public class TheExperimentDiv2 {

    public int[] determineHumidity(int[] intensity, int L, int[] leftEnd) {
        int N = intensity.length;
        int M = leftEnd.length;
        
        int[] a = new int[M];
        boolean[] marked = new boolean[N];
        
        for (int i = 0; i < M; i++)
            for (int j = leftEnd[i]; j < Math.min(N, leftEnd[i] + L); j++)
                if (!marked[j]) {
                    a[i] += intensity[j];
                    marked[j] = true;
                }
        
        return a;
    }

}