import java.util.*;

public class RunningAroundPark {

	public int numberOfLap(int N, int[] d) {
		int res = 1;
		
		int tmp = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] <= tmp) res++;
			tmp = d[i];
		}
		
		return res;
	}

}
