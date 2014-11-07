import java.util.*;

public class NinjaTurtles {

    public int countOpponents(int P, int K) {
        
        for (int N = 1; N <= 3 * P; N++)
            if (3 * (N / K) + N / 3 == P)
                return N;
        
        return -1;
    }

}