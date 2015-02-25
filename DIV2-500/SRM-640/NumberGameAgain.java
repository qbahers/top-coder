import java.util.*;

public class NumberGameAgain {

    public long solve(int k, long[] table) {
        Set<Long> forbidden = new HashSet<Long>();
        for (long x : table) forbidden.add(x);
        
        long count = 0;
        
        outer:
        for (long x : table) {
            long y = x;
            int i = 0;
            
            while (y != 1) {
                y /= 2;
                i++;
                if (forbidden.contains(y)) continue outer;
            }
            
            count += (long) Math.pow(2, k - i) - 1;
        }
        
        return (long) Math.pow(2, k) - count - 2;
    }

}