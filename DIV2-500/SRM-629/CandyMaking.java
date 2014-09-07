import java.util.*;

public class CandyMaking {
    private static int[] containerV;
    private static int[] desiredW;
    private static int N; 

    public double findSuitableDensity(int[] containerVolume, int[] desiredWeight) {
        containerV = containerVolume;
	desiredW = desiredWeight;
	N = containerVolume.length;
		
	double lo = 0.0;
	double hi = 1e10;
        for (int i = 0; i < 1000; i++) {
	    double m1 = (2 * lo + hi) / 3.0;
	    double m2 = (lo + 2 * hi) / 3.0;
			
	    if (f(m1) < f(m2)) {
	        hi = m2;
	    }
	    else {
	        lo = m1;
	    } 
	}
		
	return f(lo);
    }
	
    private static double f(double density) {
        double sum = 0;
		
	for (int i = 0; i < N; i++) 
	    sum += Math.abs(desiredW[i] - density * containerV[i]);
			
	return sum;
    }

}
