import java.util.*;

public class TeamContestEasy {

    public int worstRank(int[] strength) {
        int min = Math.min(strength[0], Math.min(strength[1], strength[2]));
        int teamStrength = strength[0] + strength[1] + strength[2] - min;
        
        List<Integer> s = new ArrayList<Integer>();
        for (int i = 3; i < strength.length; i++) 
            s.add(strength[i]);
        
        Collections.sort(s);
        
        int count = 0;
        while (!s.isEmpty()) {
            Integer X = s.get(s.size() - 1);
            Integer Y = -1;
            for (int i = 0; i < s.size() - 1; i++)
                if (X + s.get(i) > teamStrength) {
                    Y = s.get(i);
                    break;
                }
            
            if (Y != -1) {
                s.remove(X);
                s.remove(Y);
                s.remove(0);
                count++;
            }
            else 
                return 1 + count;
        }
        
        return 1 + count;
    }

}