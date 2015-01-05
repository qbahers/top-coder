import java.util.*;

public class HyperKnight {

    public long countCells(int a, int b, int numRows, int numColumns, int k) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        
        if (k == 2) return 4 * min * min;
        if (k == 3) return 8 * (max - min) * min;
        if (k == 4) return 2 * min * (numColumns - 2 * max) + 2 * min * (numRows - 2 * max) + 4 * (max - min) * (max - min);
        if (k == 6) return 2 * (max - min) * (numColumns - 2 * max) + 2 * (max - min) * (numRows - 2 * max);
        if (k == 8) return (numRows - 2 * max) * (numColumns - 2 * max); 
        return 0;
    }

}