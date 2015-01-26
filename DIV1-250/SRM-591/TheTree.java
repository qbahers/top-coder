import java.util.*;

public class TheTree {

    public int maximumDiameter(int[] cnt) {
        int N = cnt.length;
        List<Integer> l = new ArrayList<Integer>();
        
        l.add(0);
        for (int i = 0; i < N; i++)
            if (cnt[i] == 1) l.add(i + 1);

        int M = l.size();

        int res = (N - l.get(M - 1)) * 2;

        for (int i = 1; i <= N; i++)
            for (int j = 1; j < M; j++)
                if (l.get(j) <= i)
                    res = Math.max(res, i + l.get(j) - 2 * l.get(j - 1) - 1);

        return res;
    }

}