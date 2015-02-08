import java.util.*;

public class LightSwitchingPuzzle {

    public int minFlips(String state) {
        char[] s = state.toCharArray();
        int N = s.length;
        
        int res = 0;
        for (int i = 1; i <= N; i++)
            if (s[i - 1] == 'Y') {
                res++;
                for (int j = i; j <= N; j += i)
                    s[j - 1] = (s[j - 1] == 'Y') ? 'N' : 'Y';
            }
        
        return res;
    }

}