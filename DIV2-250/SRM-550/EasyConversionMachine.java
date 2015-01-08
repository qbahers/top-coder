import java.util.*;

public class EasyConversionMachine {

    public String isItPossible(String originalWord, String finalWord, int k) {
        int count = 0;
        
        for (int i = 0; i < originalWord.length(); i++)
            if (originalWord.charAt(i) != finalWord.charAt(i)) count++;
        
        return (k >= count && (k - count) % 2 == 0) ? "POSSIBLE" : "IMPOSSIBLE";
    }

}