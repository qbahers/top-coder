import java.util.*;

public class BigFatInteger2 {

    public String isDivisible(int A, int B, int C, int D) {
        
        for (int i = 2; i * i <= 1e9; i++) {
            long a = 0;
            while (A % i == 0) {
                A /= i;
                a++;
            }
            
            long c = 0;
            while (C % i == 0) {
                C /= i;
                c++;
            }
            
            if (c > 0 && a * B < c * D) {
                return "not divisible";
            }
        }
        
        return ((C == 1) || (A == C && B >= D)) ? "divisible" : "not divisible";
    }

}