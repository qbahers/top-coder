import java.util.*;

public class MonstersValley2 {

    public int minimumPrice(int[] dread, int[] price) {
        return (dread.length == 1) ? price[0] : computeMin(0, 0, 0, dread, price);
    }
    
    private int computeMin(int i, long d, int p, int[] dread, int[] price) {
        if (i == dread.length) return p;
        else {
            if (dread[i] > d) return computeMin(i + 1, d + dread[i], p + price[i], dread, price);
            else              return Math.min(computeMin(i + 1, d + dread[i], p + price[i], dread, price), 
                                              computeMin(i + 1, d, p, dread, price));
        }
    }

}