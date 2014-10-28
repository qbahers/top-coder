import java.util.*;

public class EllysNewNickname {

    public int getLength(String nickname) {
        char[] name = nickname.toCharArray();
        
        int res = 0;
        int nbConsecutiveVowels = 0;
        for (char c : name)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                nbConsecutiveVowels++;
                if (nbConsecutiveVowels < 2) res++;
            }
            else {
                nbConsecutiveVowels = 0;
                res++;
            }
        
        return res;
    }

}