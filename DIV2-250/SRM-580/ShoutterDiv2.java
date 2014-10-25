import java.util.*;

public class ShoutterDiv2 {

    public int count(int[] s, int[] t) {
        int N = s.length;
        
        int res = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (!(t[i] < s[j] || t[j] < s[i])) res++;
        
        return res;
    }

}