import java.util.*;

public class GearsDiv2 {

    public int getmin(String Directions) {
        int N = Directions.length();
        char current = 'X';
        
        int res = Integer.MAX_VALUE;
        for (int k = 0; k < N; k++) {
            int count = 0;
            for (int i = k; i <= N + k; i++) {
                if (Directions.charAt(i % N) == current) {
                    count++;
                    current = 'X';
                }
                else current = Directions.charAt(i % N);
            }
            res = Math.min(res, count);
        }
        
        return res;
    }

}