public class WakingUpEasy {

    public int countAlarms(int[] volume, int S) {
        
        boolean wakesUp = false;
        int k = 0;
        while(!wakesUp) {
            S -= volume[k % volume.length];
            k++;
            if (S <= 0) wakesUp = true;
        }
        return k;
    }

}
