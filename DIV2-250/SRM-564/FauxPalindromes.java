import java.util.*;

public class FauxPalindromes {

    public String classifyIt(String word) {
        if (isPalindrome(word)) return "PALINDROME";
        
        String w = "";
        char prev = 'z';
        for (char x : word.toCharArray()) {
            if (x != prev) w += x;
            prev = x;
        }
        
        return isPalindrome(w) ? "FAUX" : "NOT EVEN FAUX";
    }
    
    private boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N; i++)
            if (s.charAt(i) != s.charAt(N - 1 - i)) return false;
        
        return true;
    }

}