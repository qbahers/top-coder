import java.util.*;

public class BallsSeparating {

    public int minOperations(int[] red, int[] green, int[] blue) {
        int N = red.length;
        
        if (N < 3) return -1;
        
        int total = 0;
        for (int i = 0; i < N; i++)
            total += red[i] + green[i] + blue[i];
        
        int min = total;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++) {
                    int nbOps = total;
                    if (i != j && i != k && j != k)
                        for (int l = 0; l < N; l++) {
                            if      (l == i) nbOps -= red[l];
                            else if (l == j) nbOps -= green[l];
                            else if (l == k) nbOps -= blue[l];
                            else             nbOps -= Math.max(red[l], Math.max(green[l], blue[l]));
                        }
                    min = Math.min(min, nbOps);
                }
        
        return min;
    }

}