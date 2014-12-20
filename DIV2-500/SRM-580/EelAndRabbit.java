import java.util.*;

public class EelAndRabbit {

    public int getmax(int[] l, int[] t) {
        int N = l.length;
        
        Set<Integer> times = new HashSet<Integer>();
        
        for (int i = 0; i < N; i++) {
            times.add(t[i]);
            times.add(t[i] + l[i]);
        }
        
        int max = 0;
        for (Integer T : times) {
            Set<Integer> EelsCaught1 = new HashSet<Integer>();
            for (int i = 0; i < N; i++)
                if (T - t[i] >= 0 && T - t[i] - l[i] <= 0)
                    EelsCaught1.add(i);
            
            for (Integer TT : times) {
                Set<Integer> EelsCaught2 = new HashSet<Integer>();
                for (int i = 0; i < N; i++)
                    if (!EelsCaught1.contains(i) && TT - t[i] >= 0 && TT - t[i] - l[i] <= 0)
                        EelsCaught2.add(i);
                
                max = Math.max(EelsCaught1.size() + EelsCaught2.size(), max);
            }
        }
        
        return max;
    }

}