import java.util.*;

public class SplitIntoPairs {

    public int makepairs(int[] A, int X) {
        Arrays.sort(A);

        int res = 0;
        for (int i = 0; i < A.length - 1; i += 2) {
            long product = (long) A[i] * (long) A[i + 1];
            if (product >= X) res++;
        }
        
        return res;
    }

}