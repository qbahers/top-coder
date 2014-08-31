import java.util.Arrays;

public class CostOfDancing {

    public int minimum(int K, int[] danceCost) {
        Arrays.sort(danceCost);
        
        int minCost = 0;
        for (int i = 0; i < K; i++) {
            minCost += danceCost[i];
        }
        return minCost;
    }

}
