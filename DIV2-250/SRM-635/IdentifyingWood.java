import java.util.*;

public class IdentifyingWood {

    public String check(String s, String t) {
        int Ls = s.length();
        int Lt = t.length();
        
        int i = 0, j = 0;
        while (i < Ls && j < Lt) {
            if (s.charAt(i) == t.charAt(j)) j++;
            i++;
        }
        
        return (j == Lt) ? "Yep, it's wood." : "Nope.";
    }

}