import java.util.*;

public class CuttingBitString {

    public int getmin(String S) {
        int N = S.length();
        
        Set<String> powers = new HashSet<String>();
        String s = "1";
        long power = 1;
        while (s.length() <= N) {
            powers.add(s);
            power *= 5;
            s = Long.toBinaryString(power);
        }
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int k = 1; k <= N; k++) {
            for (int i = 0; i + k <= N; i++) {
                String ss = S.substring(i, i + k);
                if (powers.contains(ss)) map.put(ss, 1);
                else {
                    int min = Integer.MAX_VALUE;
                    for (int j = 1; j <= k; j++) {
                        String s1 = ss.substring(0, j);
                        String s2 = ss.substring(j, k);
                        if (map.containsKey(s1) && map.containsKey(s2) && map.get(s1) + map.get(s2) < min)
                            min = map.get(s1) + map.get(s2);
                    }
                    if (min < Integer.MAX_VALUE) map.put(ss, min);
                }
            }
        }
        
        return (map.containsKey(S)) ? map.get(S) : -1;
    }

}