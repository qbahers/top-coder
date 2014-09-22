import java.util.*;

public class PackingBallsDiv2 {

    public int minPacks(int R, int G, int B) {
        int res = R / 3 + G / 3 + B / 3;

        int r = R % 3;
        int g = G % 3;
        int b = B % 3;
        
        if (r == 0 && g == 0 && b == 0) {}
        else if (r == 2 || g == 2 || b == 2) {
            if ((r == 0 && g == 0) || (g == 0 && b == 0) || (r == 0 && b == 0)) {
                res += 1;
            }
            else {
                res += 2;
            }
        }
        else {
            res += 1;
        }
        
        return res;
    }

}