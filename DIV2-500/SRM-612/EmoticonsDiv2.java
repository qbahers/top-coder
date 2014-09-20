import java.util.*;

public class EmoticonsDiv2 {

    public int printSmiles(int smiles) {
        boolean[] primes = sieve(1000);
        int res = 0;
        
        if (primes[smiles]) {
            return smiles;
        }
        else {
            for (int i = 2; i <= smiles; i++) {
                if (!primes[i]) continue;
                
                int exponent = 0;
                while (smiles % i == 0) {
                    smiles /= i;
                    exponent++;
                }
                res += i * exponent;
            }
        }
        
        return res;
    }
    
    private boolean[] sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        int m = (int) Math.sqrt(n);
        
        for (int i = 2; i <= m; i++)
            if (primes[i])
                for (int k = i * i; k <= n; k += i)
                    primes[k] = false;
        
        return primes;
    }

}