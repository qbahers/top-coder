import java.math.*;

public class RockPaperScissorsMagicEasy {

    public int count(int[] card, int score) {
        int N = card.length;
        
        if (score > N) {
            return 0;
        }
        else {
            BigInteger res = combination(N, score)
                                .multiply(power(2, N - score))
                                .mod(BigInteger.valueOf(1000000007));

            return res.intValue();
        }
    }
    
    private BigInteger combination(int n, int k) {
        BigInteger res = BigInteger.ONE;
        
        for (int i = 0; i < k; i++) {
            res = res.multiply(BigInteger.valueOf(n - i))
                     .divide(BigInteger.valueOf(i + 1));
        }
        
        return res;
    }
    
    private BigInteger power(int b, int n) {
        BigInteger res = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(b));
        }
        
        return res;
    }

}
