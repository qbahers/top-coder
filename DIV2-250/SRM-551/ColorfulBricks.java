import java.util.*;

public class ColorfulBricks {

    public int countLayouts(String bricks) {
        Set<Character> set = new HashSet<Character>();
        
        for (char x : bricks.toCharArray())
            set.add(x);
        
        return (set.size() > 2) ? 0 : set.size();
    }

}