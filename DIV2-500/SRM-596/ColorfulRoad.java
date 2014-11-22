import java.util.*;

public class ColorfulRoad {
    private static final char[] colors = {'R','G','B'};
    private static int N;
    private int minCost = Integer.MAX_VALUE;

    public int getMin(String road) {
        N = road.length();
        
        computeMin(road, 0, 0, 1);
        
        return (minCost != Integer.MAX_VALUE) ? minCost : -1; 
    }
    
    private void computeMin(String road, int currentCost, int currentPart, int nextColorIndex) {
        for (int i = currentPart; i < N; i++) {
            if (road.charAt(i) == colors[nextColorIndex % 3]) {
                int newCost = currentCost + (i - currentPart) * (i - currentPart);
                
                if (i == N - 1 && newCost < minCost) minCost = newCost;
                else computeMin(road, newCost, i, nextColorIndex + 1);
            }
        }
    }

}