import java.util.*;

public class PalindromicSubstringsDiv2 {

    public int count(String[] S1, String[] S2) {
        StringBuilder S = new StringBuilder();
        
        for (String s1 : S1) S.append(s1);
        for (String s2 : S2) S.append(s2);
        
        int N = S.length();
        
        int res = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < 2; j++) {
                int k = 0;
                while (i - k >= 0 && i + j + k < N && S.charAt(i - k) == S.charAt(i + j + k)) k++;
                res += k;
            }
        
        return res;
    }

}