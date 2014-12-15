import java.util.*;

public class PilingRectsDiv2 {

    public int getmax(int[] X, int[] Y, int limit) {
        int N = X.length;
        
        int res = -1;
        for (int i = 0; i < N; i++) {
            if (X[i] * Y[i] < limit) continue;
            
            int x = X[i];
            int y = Y[i];
            
            int count = 0;
            for (int j = 0; j < N; j++) {
                int a1 = Math.min(x, X[j]) * Math.min(y, Y[j]);
                int a2 = Math.min(x, Y[j]) * Math.min(y, X[j]);
                
                if (Math.max(a1, a2) >= limit) {
                    count++;
                    if (a1 >= a2) {
                        x = Math.min(x, X[j]);
                        y = Math.min(y, Y[j]);
                    }
                    else {
                        x = Math.min(x, Y[j]);
                        y = Math.min(y, X[j]);
                    }
                }
            }
            res = Math.max(res, count);
        }
        
        return res;
    }

}