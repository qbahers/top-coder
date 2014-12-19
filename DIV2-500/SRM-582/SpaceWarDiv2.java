import java.util.*;

public class SpaceWarDiv2 {

    public int minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, int[] enemyCount) {
         int M = magicalGirlStrength.length;
         int N = enemyStrength.length;
         int[] magicalGirlFatigue = new int[M];
         
         int nbEnemies = 0;
         for (int i = 0; i < N; i++)
            nbEnemies += enemyCount[i];
         
         while (nbEnemies > 0) {
            int count = nbEnemies;
            for (int i = 0; i < M; i++) {
                int index = -1;
                int max = 0;
                for (int j = 0; j < N; j++)
                    if (magicalGirlStrength[i] >= enemyStrength[j] && enemyStrength[j] > max && enemyCount[j] > 0) {
                        index = j;
                        max = enemyStrength[j];
                    }
                if (index != -1) {
                    enemyCount[index]--;
                    magicalGirlFatigue[i]++;
                    nbEnemies--;
                }
            }
            if (nbEnemies == count) return -1;
        }
        
        int maxFatigue = 0;
        for (int i = 0; i < M; i++)
            if (magicalGirlFatigue[i] > maxFatigue) maxFatigue = magicalGirlFatigue[i];
            
        return maxFatigue;
    }

}