import java.util.*;

public class BuildingHeightsEasy {

    public int minimum(int M, int[] heights) {
        int N = heights.length;
        Arrays.sort(heights);
        
        int min = 2500;
        for (int i = 1; i <= 50; i++) {
            int cnt = M;
            int sum = 0;
            for (int j = N - 1; j >= 0; j--) {
                if (heights[j] <= i) {
                    cnt--;
                    sum += i - heights[j];
                    if (cnt == 0) break;        
                }
            }
            if (cnt == 0) {
                if (sum < min) min = sum;
            }
        }
        
        return min;
    }

}