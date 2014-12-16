import java.util.*;

public class PiecewiseLinearFunctionDiv2 {

    public int[] countSolutions(int[] Y, int[] query) {
        int M = Y.length, N = query.length;
        int[] res = new int[N];
        
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (query[j] == Y[i]) res[j]++;
        
        for (int i = 1; i < M; i++)
            for (int j = 0; j < N; j++)
                if (res[j] == -1)
                    continue;
                else if (query[j] == Y[i - 1] && query[j] == Y[i])
                    res[j] = -1;
                else if (query[j] > Math.min(Y[i - 1], Y[i]) && query[j] < Math.max(Y[i - 1], Y[i]))
                    res[j]++;
        
        return res;
    }

}