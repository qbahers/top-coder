import java.util.*;

public class TaroString {

    public String getAnswer(String S) {
        int[] a = new int[3];
        for (char c : S.toCharArray()) {
            if (c == 'C') a[0]++;
            if (c == 'A') a[1]++;
            if (c == 'T') a[2]++;
        }

        if ((Arrays.equals(a, new int[]{1, 1, 1})) && (S.indexOf('C') < S.indexOf('A')) 
            && (S.indexOf('A') < S.indexOf('T'))) {
            return "Possible";
        }
        return "Impossible";
    }

}
