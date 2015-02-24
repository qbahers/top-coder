import java.util.*;

public class TaroFillingAStringDiv2 {

    public int getNumber(String S) {
        int N = S.length();
        
        while (S.indexOf("?") != -1) {
            String s1 = change(S, 'A');
            String s2 = change(S, 'B');
            S = (ugliness(s1) < ugliness(s2)) ? s1 : s2;
        }
        
        return ugliness(S);
    }
    
    private int ugliness(String s) {  
        int nbPairs = 0;

        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == s.charAt(i - 1)) nbPairs++;
        
        return nbPairs;
    }

    private String change(String s, char c) {
        StringBuilder ss = new StringBuilder(s);
        int N = ss.length();
        char cur = c;

        int k = 0;
        while (k < N && ss.charAt(k) != '?') k++;
        while (k < N && ss.charAt(k) == '?') {
            ss.setCharAt(k, cur);
            cur = (cur == 'A') ? 'B' : 'A';
            k++;
        }

        return new String(ss);
    }

}