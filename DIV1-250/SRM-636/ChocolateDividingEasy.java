import java.util.*;

public class ChocolateDividingEasy {

    public int findBest(String[] chocolate) {
        int N = chocolate.length;
        int M = chocolate[0].length();
        
        int res = 0;
        for (int i = 1; i <= N - 2; i++) {
            for (int j = N - 1; j > i; j--) {
                for (int k = 1; k <= M - 2; k++) {
                    
                    int[] a = new int[9];
                    for (int x = 0; x < N; x++) {
                        for (int y = 0; y < M; y++) {
                            int q = chocolate[x].charAt(y) - '0';
                            
                            int d = (x < i) ? 0 : (x < j) ? 1 : 2;

                            if (y < k) a[d * 3]     += q;
                            else       a[d * 3 + 2] += q;
                        }
                    }
                        
                    for (int y = k; y < M - 1; y++) {
                        for (int x = 0; x < N; x++) {
                            int q = chocolate[x].charAt(y) - '0';
                            
                            int d = (x < i) ? 0 : (x < j) ? 1 : 2;
                            
                            a[d * 3 + 1] += q;
                            a[d * 3 + 2] -= q;
                        }
                        
                        int min = Integer.MAX_VALUE;
                        for (int x : a) 
                            if (x < min) min = x;
                            
                        res = Math.max(res, min);       
                    }
                }
            }
        }
        
        return res;     
    }

}