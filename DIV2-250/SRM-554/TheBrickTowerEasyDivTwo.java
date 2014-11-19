import java.util.*;

public class TheBrickTowerEasyDivTwo {

    public int find(int redCount, int redHeight, int blueCount, int blueHeight) {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i <= redCount; i++)
            for (int j = 0; j <= blueCount; j++)
                if (Math.abs(j - i) < 2) set.add(i * redHeight + j * blueHeight);

        return set.size() - 1;
    }

}