import java.util.*;

public class WolfDelaymaster {

    public String check(String str) {
        char[] s = str.toCharArray();
        int N = s.length;
        
        int i = 0;
        while (i < N) {
            int n = 0;
            while (i < N && s[i] == 'w') {
                n++;
                i++;
            }
            if (n == 0 || i + 3 * n > N) return "INVALID";
            
            char[] letters = new char[]{'o', 'l', 'f'};
            
            for (int j = 0; j < 3; j++) {
                int k = i;
                for (int l = k; l < k + n; l++) {
                    if (s[l] != letters[j]) return "INVALID";
                    i++;
                }
            }
        }
        
        return "VALID";
    }

}