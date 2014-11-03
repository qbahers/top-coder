import java.util.*;

public class FoxAndGame {

    public int countStars(String[] result) {
        int res = 0;
        
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[0].length(); j++)
                if (result[i].charAt(j) == 'o') res++;
        
        return res;
    }

}