import java.util.*;

public class AliceGameEasy {

    public long findMinimumValue(long x, long y) {
        long sum = x + y;
        
        long nbTurns = binarySearch(sum);
        if (nbTurns == -1)
            return -1;
        else {
            long res = 0;
            while (x > 0) {
                x -= nbTurns;
                nbTurns--;
                res++;
            }
            return res;
        }   
    }
    
    private long binarySearch(long key) {
        long lo = 0, hi = 2000000;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if      (key < mid * (mid + 1) / 2) hi = mid - 1;
            else if (key > mid * (mid + 1) / 2) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

}