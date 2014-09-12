import java.util.*;

public class NumbersChallenge {

    public int MinNumber(int[] S) {
        int N = S.length;
        
        Set<Integer> sums = new HashSet<Integer>();
        for (int mask = 1; mask < (1 << N); mask++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) > 0) {
                    sum += S[i];
                }
            }
            sums.add(sum);
        }
        
        int k = 1;
        while (sums.contains(k)) {
            k++;
        }
        
        return k;
    }

}