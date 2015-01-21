import java.util.*;

public class TypoCoderDiv1 {

    public int getmax(int[] D, int X) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(X, 0);
        
        for (int d : D) {
            Map<Integer, Integer> n = new HashMap<Integer, Integer>();
            
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                int key = entry.getKey();
                int val = entry.getValue();
                
                int keyPlus  = key + d;
                int keyMinus = Math.max(0, key - d);
                
                if (key < 2200) {
                    int v = val;
                    if (keyPlus >= 2200) v++;
                    
                    if (check(n, keyPlus, v))  
                        n.put(keyPlus, v);
                    if (check(n, keyMinus, val))
                        n.put(keyMinus, val);
                }
                else {
                    if (keyMinus < 2200 && check(n, keyMinus, val + 1))
                        n.put(keyMinus, val + 1);
                }
            }
            
            m = n;
        }
        
        int res = 0;
        for (int value : m.values())
            res = Math.max(res, value);
        
        return res;
    }
    
    private boolean check(Map<Integer, Integer> map, int key, int value) {
        return !map.containsKey(key) || (map.containsKey(key) && map.get(key) < value);
    }

}