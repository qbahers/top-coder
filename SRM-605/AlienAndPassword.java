import java.util.*;

public class AlienAndPassword {

    public int getNumber(String S) {
        Set<String> set = new HashSet<String>();

        for (int i = 0; i < S.length(); i++) {
            String s = S.substring(0, i) + S.substring(i + 1);
            set.add(s);
        }

        return set.size();
    }

}
