import java.util.*;

public class TaroFriends {

    public int getNumber(int[] coordinates, int X) {
        int N = coordinates.length;
        
        Arrays.sort(coordinates);
        int minDiff = coordinates[N - 1] - coordinates[0];
        
        for (int i = 0; i < N; i++) {
            List<Integer> newCoord = new ArrayList<Integer>();
            
            for (int j = 0; j < N; j++)
                if (j <= i) newCoord.add(coordinates[j] + X);
                else        newCoord.add(coordinates[j] - X);
            
            Collections.sort(newCoord);
            
            int diff = newCoord.get(N - 1) - newCoord.get(0);
            if (diff < minDiff) minDiff = diff;
        }
        
        return minDiff;
    }

}