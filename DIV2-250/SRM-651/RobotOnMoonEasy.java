import java.util.*;

public class RobotOnMoonEasy {

    public String isSafeCommand(String[] board, String S) {
        int x = -1, y = -1;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                if (board[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        for (int k = 0; k < S.length(); k++) {
            int nx = x, ny = y;
        
            if      (S.charAt(k) == 'U') nx--;
            else if (S.charAt(k) == 'D') nx++;
            else if (S.charAt(k) == 'L') ny--;
            else                         ny++;
            
            if (nx < 0 || nx >= board.length || 
                ny < 0 || ny >= board[0].length())
                    return "Dead";
            else if (board[nx].charAt(ny) != '#') {
                x = nx;
                y = ny;
            }
        }
        
        return "Alive";
    }

}