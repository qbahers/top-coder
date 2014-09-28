import java.util.*;

public class Jumping {

    public String ableToGet(int x, int y, int[] jumpLengths) {
        int N = jumpLengths.length;
        double dist = Math.sqrt(x*x + y*y);
        
        int maxDist = 0;
        for (int i = 0; i < N; i++)
            maxDist += jumpLengths[i];
        
        Arrays.sort(jumpLengths);
        int maxLength = jumpLengths[N - 1];
        
        if (2 * maxLength - maxDist > dist) return "Not able";
            
        return (maxDist >= dist) ? "Able" : "Not able";
    }

}