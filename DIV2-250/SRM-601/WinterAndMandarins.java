import java.util.*;

public class WinterAndMandarins {

    public int getNumber(int[] bags, int K) {
        Arrays.sort(bags);
        
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < bags.length - K + 1; i++) 
            if (bags[i + K - 1] - bags[i] < diff) diff = bags[i + K - 1] - bags[i];
        
        return diff;
    }

}