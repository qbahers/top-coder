import java.util.*;

public class MiddleCode {

    public String encode(String s) {
        StringBuilder ss = new StringBuilder(s);
        StringBuilder tt = new StringBuilder();
        
        while (ss.length() != 0) {
            int k = ss.length() / 2;
            if (ss.length() % 2 == 0 && ss.charAt(k - 1) < ss.charAt(k)) k--;
            
            tt.append(ss.charAt(k));
            ss.deleteCharAt(k);
        }

        return new String(tt);
    }

}