import java.util.*;

public class BinPackingEasy {

    public int minBins(int[] item) {
        int N = item.length;
        int count = 0;
        
        Arrays.sort(item);
        
        int i = 0, j = N - 1;
        while (i < j) {
            if (item[i] + item[j] <= 300) {
                i++;
            }
            j--;
            count++;
        }
        
        return (i == j) ? count + 1 : count;
    }

}