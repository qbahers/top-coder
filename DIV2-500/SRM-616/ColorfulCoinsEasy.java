import java.util.*;

public class ColorfulCoinsEasy {

    public String isPossible(int[] values) {
        int N = values.length;
        
        outer:
        for (int k = 1; k < 200000; k++) {
            List<Integer> nbCoins = new ArrayList<Integer>();
            
            int r = k;
            for (int i = N - 1; i >= 0; i--) {
                int q = r / values[i];
                if (q != 0) nbCoins.add(q);
                r %= values[i];
            }
            
            if (nbCoins.size() != N) continue;
            
            Collections.sort(nbCoins);
            for (int j = 1; j < N; j++)
                if (nbCoins.get(j - 1).equals(nbCoins.get(j))) continue outer;
                
            return "Possible";
        }
        
        return "Impossible";
    }

}