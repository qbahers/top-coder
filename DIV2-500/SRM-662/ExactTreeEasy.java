import java.util.*;

public class ExactTreeEasy {

    public int[] getTree(int n, int m) {
        List<Integer> l = new ArrayList<Integer>();
        
        int i = 0;
        int j = 1;
        
        for (int k = 0; k < n - m + 1; k++) {
            l.add(i);
            l.add(j);
            
            i++;
            j++;
        }
        
        while (l.size() <= 2 * n - 2) {
            l.add(i - 1);
            l.add(j);
            
            j++;
        }
        
        int[] res = new int[2 * n - 2];
        for (int k = 0; k < 2 * n - 2; k++) {
            res[k] = l.get(k);
        } 
        
        return res;
    }

}