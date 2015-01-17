import java.util.*;

public class BuildingHeights {

    public int minimum(int[] heights) {
        int N = heights.length;
        
        Arrays.sort(heights);
        
        int[] A = new int[N];
        Arrays.fill(A, Integer.MAX_VALUE);
        
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int k = 0; i + k < N; k++) {
                sum += heights[i + k];
                A[k] = Math.min(A[k], (k + 1) * heights[i + k] - sum);
            }
        }
        
        int res = 0;
        for (Integer e : A) res ^= e;
        
        return res;
    }

}