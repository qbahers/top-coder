import java.util.*;

public class AstronomicalRecordsEasy {

    public int minimalPlanets(int[] A, int[] B) {
        int M = A.length;
        int N = B.length;
        
        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++) {
                Set<Integer> a = new HashSet<Integer>();
                for (int k = 0; k < M; k++)
                    a.add(A[k] * B[j]);
                
                Set<Integer> b = new HashSet<Integer>();
                for (int l = 0; l < N; l++)
                    b.add(B[l] * A[i]);
                
                a.addAll(b);
                res = Math.min(res, a.size());
            }
        
        return res;
    }

}