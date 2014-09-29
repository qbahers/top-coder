import java.util.*;

public class MountainRanges {

    public int countPeaks(int[] heights) {
        int N = heights.length;
        
        int nbPeaks = 0;
        for (int i = 0; i < N; i++) {
            if ((i - 1 >= 0 && heights[i] <= heights[i - 1]) ||
                (i + 1 <  N && heights[i] <= heights[i + 1])) continue;
            nbPeaks++;
        }
        
        return nbPeaks;
    }

}