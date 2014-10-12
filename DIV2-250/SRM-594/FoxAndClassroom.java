import java.util.*;

public class FoxAndClassroom {

    public String ableTo(int n, int m) {
        boolean[][] seats = new boolean[n][m];
        
        int r = 0;
        int c = 0;
        for (int k = 1; k <= n * m; k++) {
            seats[r][c] = true;
            r = (r + 1) % n;
            c = (c + 1) % m;
        }
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (!seats[i][j]) return "Impossible";
        
        return "Possible";
    }

}