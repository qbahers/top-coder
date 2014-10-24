import java.util.*;

public class BlackAndWhiteSolitaire {

    public int minimumTurns(String cardFront) {
        int N = cardFront.length();
        char[] color = new char[]{'B', 'W'};
        
        int count1 = 0, count2 = 0;
        for (int i = 0; i < N; i++) {
            if (cardFront.charAt(i) != color[i % 2]) count1++;
            else count2++;
        }
        
        return Math.min(count1, count2);
    }

}