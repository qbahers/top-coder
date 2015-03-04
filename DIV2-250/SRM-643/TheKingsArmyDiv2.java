import java.util.*;

public class TheKingsArmyDiv2 {

    public int getNumber(String[] state) {
        int R = state.length;
        int C = state[0].length();
        
        boolean areSad = true;
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                if (state[i].charAt(j) == 'H') {
                    areSad = false;
                    if ((i + 1 < R && state[i + 1].charAt(j) == 'H') ||
                        (j + 1 < C && state[i].charAt(j + 1) == 'H'))
                        return 0;
                }
        
        return (areSad) ? 2 : 1;
    }

}
