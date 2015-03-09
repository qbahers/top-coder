import java.util.*;

public class PeacefulLine {

    public String makeLine(int[] x) {
        int N = x.length;

        int[] count = new int[26];
        for (int i = 0; i < N; i++)
            count[x[i]]++;
        
        Arrays.sort(count);
        
        return (2 * count[25] <= N + 1) ? "possible" : "impossible";
    }

}