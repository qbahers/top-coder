import java.util.*;

public class SurroundingGameEasy {
    private static String[] stone;
    private static int N;
    private static int M;

    public int score(String[] cost, String[] benefit, String[] stone) {
        this.stone = stone;
        this.N = stone.length;
        this.M = stone[0].length();
        
        int res = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                if (stone[i].charAt(j) == 'o') res -= cost[i].charAt(j) - '0';
                if (isDominated(i, j))         res += benefit[i].charAt(j) - '0';
            }
        
        return res;
    }
    
    private boolean isDominated(int i, int j) {
        if (stone[i].charAt(j) == 'o') return true;
    
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && x < N && y >= 0 && y < M && stone[x].charAt(y) == '.')
                return false;
        }
        
        return true;
    }

}