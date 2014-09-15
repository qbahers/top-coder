import java.util.*;

public class SlimeXSlimonadeTycoon {

    public int sell(int[] morning, int[] customers, int stale_limit) {
        int N = morning.length;
        
        int totalSum = 0;
        int index = 0;
        for (int i = 0; i < N; i++) {
            while (i - index + 1 > stale_limit) index++;
            
            int oldIndex;
            do {
                oldIndex = index;
                int sum = Math.min(morning[index], customers[i]);
                totalSum += sum; 
                morning[index] -= sum;
                customers[i] -= sum;
                if (morning[index] == 0) index++;
            } while (index != oldIndex && index <= i);  
        }
        
        return totalSum;
    }

}