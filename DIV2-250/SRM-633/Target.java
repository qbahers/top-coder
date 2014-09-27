import java.util.*;

public class Target {

    public String[] draw(int n) {
        char[][] target = new char[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                target[i][j] = ' ';
                
        for (int k = 0; k <= n / 2; k += 2) {
            for (int l = k; l < n - k; l++) {
                target[l][k] = '#';
                target[k][l] = '#';
                target[l][n - k - 1] = '#';
                target[n - k - 1][l] = '#';
            }
        }
        
        String[] res = new String[n];
        for (int i = 0; i < n; i++)
            res[i] = new String(target[i]);
        
        return res;
    }

}