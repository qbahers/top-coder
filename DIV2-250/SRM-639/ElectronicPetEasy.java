import java.util.*;

public class ElectronicPetEasy {

    public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < t1; i++)
            set.add(st1 + i * p1);
        
        for (int i = 0; i < t2; i++)
            if (set.contains(st2 + i * p2)) return "Difficult";
            else set.add(st2 + i * p2);
        
        return "Easy";
    }

}