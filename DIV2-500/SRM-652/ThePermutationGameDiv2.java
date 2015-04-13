import java.util.*;

public class ThePermutationGameDiv2 {

    public long findMin(int N) {
        long res = 1;
        
        for (int i = 1; i <= N; i++)
            res = lcm(res, i);
        
        return res;
    }
    
    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
    
    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}