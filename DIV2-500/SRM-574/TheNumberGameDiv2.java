import java.util.*;

public class TheNumberGameDiv2 {

    public int minimumMoves(int A, int B) {
        String a = String.valueOf(A);
        String b = String.valueOf(B);

        String aa = new StringBuilder(a).reverse().toString();
    
        int M = a.length();
        int N = b.length();
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < M - N + 1; i++) {
            if (a.regionMatches(i, b, 0, N))
                min = (i == 0) ? Math.min(min, M - N) : Math.min(min, M - N + 2);
            
            if (aa.regionMatches(i, b, 0, N))
                min = Math.min(min, M - N + 1);
        }
        
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }

}