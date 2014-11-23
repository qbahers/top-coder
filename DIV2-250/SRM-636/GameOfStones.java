import java.util.*;

public class GameOfStones {

    public int count(int[] stones) {
        int N = stones.length;
        
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += stones[i];
        
        if (sum % N != 0) return -1;
        int avg = sum / N;
        
        int res = 0;
        for (int i = 0; i < N; i++) {
            if ((avg - stones[i]) % 2 != 0) return -1;
            else res += Math.abs(avg - stones[i]) / 2;
        }
        res /= 2;
        
        return res;
    }

}