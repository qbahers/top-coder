import java.util.*;

public class KeyDungeonDiv2 {

    public int countDoors(int[] doorR, int[] doorG, int[] keys) {
        int count = 0;
        
        for (int i = 0; i < doorR.length; i++) {
            int keyR = keys[0], keyG = keys[1], keyW = keys[2];
            
            keyR -= doorR[i];
            if (keyR < 0) keyW += keyR;
            
            keyG -= doorG[i];
            if (keyG < 0) keyW += keyG;
            
            if (keyW >= 0) count++;
        }
        
        return count;
    }

}