import java.util.*;

public class MagicalStringDiv1 {

    public int getLongest(String S) {
        int N = S.length();

        int res = 0;
        for (int k = 1; k <= N / 2; k++) {
            int i = 0;
            int count = 0;
            while (i < N && count < k) {
                if (S.charAt(i) == '>') count++;
                i++;
            }

            if (count == k) {
                while (i < N && count > 0) {
                    if (S.charAt(i) == '<') count--;
                    i++;
                }
                
                if (count == 0) res = 2 * k;
                else            break;
            }
        }

        return res;
    }

}