import java.util.*;

public class LongLongTripDiv2 {

    public String isAble(long D, int T, int B) {
        long Q = D / B;
        long R = D % B;
        
        if ((T - (Q + R)) % (B - 1) == 0 && T >= Q + R && T <= Q * B + R) {
            return "Possible";
        }
        else {
            return "Impossible";
        }
    }

}