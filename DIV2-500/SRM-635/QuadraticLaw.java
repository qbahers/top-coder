import java.util.*;

public class QuadraticLaw {

    public long getTime(long d) {
        long lo = 0, hi = (long) 1e9;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if      (mid * (1 + mid) < d) lo = mid + 1;
            else if (mid * (1 + mid) > d) hi = mid - 1;
            else return mid;
        }
        return lo - 1;
    }

}