import java.util.*;

public class FoxAndSouvenirTheNext {

    public String ableToSplit(int[] value) {
        int N = value.length;
        
        int sum = 0;
        for (int e : value) sum += e;
        
        if (N % 2 != 0 || sum % 2 != 0) return "Impossible";

        boolean[][][] dp = new boolean[sum / 2 + 1][N / 2 + 1][N + 1];

        dp[0][0][0] = true;

        for (int x = 0; x <= sum / 2; x++) {
            for (int y = 1; y <= N / 2; y++) {
                for (int z = 1; z <= N; z++) {
                    if (x - value[z - 1] >= 0) {
                        dp[x][y][z] = dp[x][y][z - 1] || dp[x - value[z - 1]][y - 1][z - 1];
                    }
                    else {
                        dp[x][y][z] = dp[x][y][z - 1];
                    }
                }
            }
        }
            
        return (dp[sum / 2][N / 2][N]) ? "Possible" : "Impossible";
    }

}