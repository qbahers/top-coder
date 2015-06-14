import java.util.*;

public class LCMSetEasy {

    public String include(int[] S, int x) {
        int N = S.length;
        
        int l = 1;
        for (int i = 0; i < N; i++) {
            if (x % S[i] == 0) {
                l = lcm(l, S[i]);
            }
        }
        
        return (l == x) ? "Possible" : "Impossible";
    }
    
     private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}