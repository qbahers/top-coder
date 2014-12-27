import java.util.*;

public class NextOrPrev {

    public int getMinimum(int nextCost, int prevCost, String start, String goal) {
        char[] s = start.toCharArray();
        char[] g = goal.toCharArray();
        
        int N = s.length;
        
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (!((s[i] < s[j] && g[i] < g[j]) || (s[j] < s[i] && g[j] < g[i])))
                    return -1;
        
        int res = 0;
        for (int i = 0; i < N; i++)
            res += (s[i] < g[i]) ? (g[i] - s[i]) * nextCost : (s[i] - g[i]) * prevCost;
        
        return res;
    }

}