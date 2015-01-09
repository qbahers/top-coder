import java.util.*;

public class TheBrickTowerMediumDivTwo {
    private List<String> orders;

    public int[] find(int[] heights) {
        int N = heights.length;
        
        String s = "";
        for (int i = 0; i < N; i++)
            s += "" + i;
        
        orders = new ArrayList<String>();
        permutations(s);
        
        String ss = new String();
        int min = Integer.MAX_VALUE;
        
        for (String o : orders) {
            int dist = 0;
            for (int i = 1; i < N; i++)
                dist += Math.max(heights[o.charAt(i - 1) - '0'], heights[o.charAt(i) - '0']);
            
            if (dist < min) {
                min = dist;
                ss = o;
            }
        }
        
        int[] res = new int[N];
        for (int i = 0; i < N; i++)
            res[i] = ss.charAt(i) - '0';
         
        return res;
    }
    
    private void permutations(String s) { permutations("", s); }
    
    private void permutations(String prefix, String s) {
        int N = s.length();
        if (N == 0) orders.add(prefix);
        else {
            for (int i = 0; i < N; i++)
                permutations(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
        }
    }

}