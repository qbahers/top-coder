import java.util.*;

public class ErasingCharacters {

    public String simulate(String s) {
        StringBuilder ss = new StringBuilder(s);
        
        boolean change = true;
        while (change) {
            change = false;
            
            for (int i = 1; i < ss.length(); i++)
                if (ss.charAt(i - 1) == ss.charAt(i)) {
                    ss.delete(i - 1, i + 1);
                    change = true;
                    break;
                }
        }

        return ss.toString();
    }

}