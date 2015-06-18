import java.util.*;

public class GUMIAndSongsDiv2 {

    public int maxSongs(int[] duration, int[] tone, int T) {
        int N = tone.length;
        
        int res = 0;
        for (int mask = 0; mask < (1 << N); mask++) {
            int minTone = Integer.MAX_VALUE;
            int maxTone = 0;
            int t = 0;
            
            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) > 0) {
                    minTone = Math.min(minTone, tone[i]);
                    maxTone = Math.max(maxTone, tone[i]);
                    t += duration[i];
                }
            }
            t += maxTone - minTone;
            
            if (t <= T) {
                res = Math.max(res, Integer.bitCount(mask));
            }
        }
        
        return res;
    }

}