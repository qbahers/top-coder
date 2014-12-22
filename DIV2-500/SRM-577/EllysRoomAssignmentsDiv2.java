import java.util.*;

public class EllysRoomAssignmentsDiv2 {

    public double getProbability(String[] ratings) {
        String s = new String();
        for (String ss : ratings) s += ss;
        
        List<Integer> r = new ArrayList<Integer>();
        for (String rating : s.split(" "))
            r.add(Integer.parseInt(rating));
        
        int N = r.size();
        int R = (N + 19) / 20;
        int EllysRating = r.get(0);
            
        Collections.sort(r, Collections.reverseOrder());
        
        if      (EllysRating == r.get(0))    return 1.0;
        else if (r.indexOf(EllysRating) < R) return 0.0;
        else                                 return 1.0 / R;  
    }

}