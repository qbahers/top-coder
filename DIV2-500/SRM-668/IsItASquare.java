import java.util.*;

public class IsItASquare {

    public String isSquare(int[] x, int[] y) {
        Set<Integer> d = new HashSet<Integer>();
        
        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++)
                d.add((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
        
        List<Integer> l = new ArrayList<Integer>(d);
        
        Collections.sort(l);
        
        return (l.size() == 2 && l.get(1) == 2 * l.get(0)) ? "It's a square" : "Not a square";
    }

}