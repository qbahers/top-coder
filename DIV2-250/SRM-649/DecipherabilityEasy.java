import java.util.*;

public class DecipherabilityEasy {

    public String check(String s, String t) {
        
        for (int i = 0; i < s.length(); i++)
            if (t.equals(s.substring(0, i) + s.substring(i + 1)))
                return "Possible";
        
        return "Impossible";
    }

}