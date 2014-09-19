import java.util.*;

public class EllysSubstringSorter {

    public String getMin(String S, int L) {
        String res = S;

        char[] s = S.toCharArray();
        for (int i = 0; i <= s.length - L; i++) {
            char[] tmp = s.clone();
            Arrays.sort(tmp, i, i + L);
            String s1 = new String(tmp);
            if (s1.compareTo(res) < 0) res = s1;
            
        }

        return res;
    }

}
