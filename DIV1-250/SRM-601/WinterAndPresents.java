import java.util.*;

public class WinterAndPresents {

    public long getNumber(int[] apple, int[] orange) {
        int N = apple.length;
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++)
            min = Math.min(min, apple[i] + orange[i]);
        
        long res = 0;
        for (int k = 1; k <= min; k++) {
            long hi = 0;
            long lo = 0;
            for (int i = 0; i < N; i++) {
                hi += Math.min(apple[i], k); 
                lo += k - Math.min(orange[i], k);
            }
            res += hi - lo + 1;
        }
        
        return res;
    }

}