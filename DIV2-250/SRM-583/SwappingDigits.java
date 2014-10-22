import java.util.*;

public class SwappingDigits {

    public String minNumber(String num) {
        StringBuilder nm = new StringBuilder(num);
        int N = nm.length();
        
        for (int i = 0; i < N - 1; i++) {
            char min = nm.charAt(i);
            int index = i;
            for (int j = i + 1; j < N; j++) {
                if (i == 0 && nm.charAt(j) == '0') continue;
                if (nm.charAt(j) <= min) {
                    min = nm.charAt(j);
                    index = j;
                }
            }
            if (min < nm.charAt(i)) {
                char tmp = nm.charAt(i);
                nm.setCharAt(i, nm.charAt(index));
                nm.setCharAt(index, tmp);
                return nm.toString();
            }
        }
        
        return nm.toString();
    }

}