import java.util.*;

public class MysticAndCandiesEasy {

    public int minBoxes(int C, int X, int[] high) {
        int N = high.length;
        int[] boxes = new int[N];
        
        Arrays.sort(high);
        
        int k = 0;
        while (C > 0) {
            int min = Math.min(high[k], C);
            boxes[k] = min;
            C -= min;
            k++;
        }
        
        k = N - 1;
        int sum = 0;
        int cnt = 0;
        while (sum < X) {
            sum += boxes[k];
            k--;
            cnt++;
        }
        
        return cnt;
    }

}