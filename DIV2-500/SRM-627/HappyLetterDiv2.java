import java.util.*;

public class HappyLetterDiv2 {
    
    public static char getHappyLetter(String letters) {
        int[] counts = new int[26];

        for (int i = 0; i < letters.length(); i++)
            counts[letters.charAt(i) - 'a']++;
       
        int max = 0;
        int index = -1;
        for (int i = 0; i < 26; i++) {
            if (counts[i] > max) {
                max = counts[i];
                index = i;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (i == index) continue;
            sum += counts[i];
        }

        if (max > sum) {
            return (char)(97 + index);
        }
        else {
            return '.';
        }
    }
}
