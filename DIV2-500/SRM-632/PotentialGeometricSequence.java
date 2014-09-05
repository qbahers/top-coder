import java.util.*;

public class PotentialGeometricSequence {

    public int numberOfSubsequences(int[] d) {
        int N = d.length;
		
	int cnt = N;
		
	for (int i = 0; i < N - 1; i++) {
	    int lnQ = d[i + 1] - d[i];
			
	    for (int j = i + 1; j < N; j++) {
	        if (d[j] - d[j - 1] == lnQ) {
		    cnt++;
		}
		else {
		    break;
		}
	    }
	}
		
	return cnt;
    }

}
