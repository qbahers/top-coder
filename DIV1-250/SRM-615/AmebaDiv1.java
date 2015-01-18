import java.util.*;

public class AmebaDiv1 {

    public int count(int[] X) {
        Set<Integer> set = new HashSet<Integer>();
        for (int e : X) set.add(e);
        
        for (int e : X) {
            int size = e;
            for (int ee : X)
                if (size == ee && size <= 1e9) size *= 2;
            set.remove(size);
        }
        
        return set.size();
    }

}