import java.util.*;

public class RobotHerbDiv2 {

    public int getdist(int T, int[] a) {
        int x = 0;
        int y = 0;  
        int dir = 0;
        
        for (int t = 0; t < T; t++)
            for (int i = 0; i < a.length; i++) {
                if (dir == 0) x += a[i];
                if (dir == 1) y -= a[i];
                if (dir == 2) x -= a[i];
                if (dir == 3) y += a[i];
                
                dir = (dir + a[i]) % 4;
            }
        
        return Math.abs(x) + Math.abs(y);
    }

}