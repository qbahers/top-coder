import java.util.*;

public class AlternateColors {
    private static final String R = "RED";
    private static final String G = "GREEN";
    private static final String B = "BLUE";

    public String getColor(long r, long g, long b, long k) {
        long[] a = new long[]{r, g, b};
        
        Arrays.sort(a);
        
        if (k <= 3 * a[0]) {
            long i = (k - 1) % 3;
            if      (i == 0) return R;
            else if (i == 1) return G;
            else             return B;
        }
        else if (k <= a[0] + 2 * a[1]) {
            long i = (k - 3 * a[0] - 1) % 2;
            if      (a[0] == r) return (i == 0) ? G : B;
            else if (a[0] == g) return (i == 0) ? R : B;
            else                return (i == 0) ? R : G; 
            
        }
        else {
            if      (a[2] == r) return R;
            else if (a[2] == g) return G;
            else                return B;
        }
    }

}