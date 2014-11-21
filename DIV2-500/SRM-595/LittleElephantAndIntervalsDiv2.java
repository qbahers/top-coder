import java.util.*;

public class LittleElephantAndIntervalsDiv2 {

    public int getNumber(int M, int[] L, int[] R) {
        int N = L.length;
        
        int cnt = 1;
        for (int i = 0; i < N; i++) {
            Set<Integer> balls = new HashSet<Integer>();
            for (int k = L[i]; k <= R[i]; k++)
                balls.add(k);
            
            for (int j = i + 1; j < N; j++)
                for (int l = L[j]; l <= R[j]; l++)
                    balls.remove(l);
                    
            if (!balls.isEmpty()) 
                cnt *= 2;
        }
        
        return cnt;
    }

}