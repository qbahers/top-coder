import java.util.*;

public class EllysNumberGuessing {

    public int getNumber(int[] guesses, int[] answers) {
        Set<Integer> possibilities = new HashSet<Integer>();
        
        for (int i = 0; i < guesses.length; i++) {
            int p1 = guesses[i] - answers[i];
            int p2 = guesses[i] + answers[i];
            
            if (possibilities.isEmpty()) {
                if (p1 >= 1 && p1 <= 1e9) possibilities.add(p1);
                if (p2 >= 1 && p2 <= 1e9) possibilities.add(p2);
                if (possibilities.isEmpty()) return -2;
            }
            else {
                if (!possibilities.contains(p1) && !possibilities.contains(p2)) {
                    return -2;
                }
                else if (!(possibilities.contains(p1) && possibilities.contains(p2))) {
                    if (possibilities.contains(p1)) {
                        possibilities.clear();
                        possibilities.add(p1);
                    }
                    else {
                        possibilities.clear();
                        possibilities.add(p2);
                    }
                }
            }
        }
        
        if (possibilities.isEmpty()) {
            return -2;
        }
        else if (possibilities.size() == 1) {
            return possibilities.iterator().next();
        }   
        else {
            return -1;
        }
    }

}
