import java.util.*;

public class GoodString {

    public String isGood(String s) {
    
        while (s.contains("ab"))
            s = s.replace("ab", "");
        
        return s.isEmpty() ? "Good" : "Bad";
    }

}