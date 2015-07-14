import java.util.*;

public class SplitStoneGame {

    public String winOrLose(int[] number) {
        int[][] dp = new int[51][51];
        
        dp[0][0] = 0;
        
        for (int i = 0; i <= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                if (i - 1 >= 0) {
                    dp[i][j] = (dp[i - 1][j] + 1) % 2;
                }
                else if (j - 1 >= 0) {
                    dp[i][j] = (dp[i][j - 1] + 1) % 2;
                }
            }
        }
        
        int k = 0;
        int l = 0;
        for (int x : number) {
            if (x == 1) k++;
            else        l++;
        }
        
        if (k == 0 && l == 1) return "LOSE";
        
        return (dp[k][l] == 1) ? "WIN" : "LOSE";
    }

}
