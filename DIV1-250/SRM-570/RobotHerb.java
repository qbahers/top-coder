import java.util.*;

public class RobotHerb {

    public long getdist(int T, int[] a) {
        long x = 0, y = 0;
        long dir = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (dir == 0) x += a[i];
            if (dir == 1) y -= a[i];
            if (dir == 2) x -= a[i];
            if (dir == 3) y += a[i];
            
            dir = (dir + a[i]) % 4;
        }
        
        long xx = Math.abs(x);
        long yy = Math.abs(y);
        
        if      (dir == 0) return T * (xx + yy);
        else if (dir == 2) return (T % 2 == 0) ? 0 : xx + yy;
        else {
            if      (T % 4 == 0) return 0;
            else if (T % 4 == 2) return xx + yy + Math.abs(xx - yy);
            else                 return xx + yy;                        
        }
    }

}