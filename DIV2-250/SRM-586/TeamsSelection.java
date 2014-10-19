import java.util.*;

public class TeamsSelection {

    public String simulate(int[] preference1, int[] preference2) {
        int N = preference1.length;
        
        List<Integer> p1 = new ArrayList<Integer>();
        List<Integer> p2 = new ArrayList<Integer>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < N; i++) {
            p1.add(preference1[i]);
            p2.add(preference2[i]);
            res.append("2");
        }
            
        while (!p1.isEmpty()) {
            Integer boy1 = p1.remove(0);
            res.replace(boy1 - 1, boy1, "1");
            p2.remove(boy1);
            
            if (!p2.isEmpty()) {
                Integer boy2 = p2.remove(0);
                p1.remove(boy2);
            }
        }
        
        return res.toString();
    }

}