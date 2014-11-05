import java.util.*;

public class TheJediTestDiv2 {

    public int countSupervisors(int[] students, int Y, int J) {
        int N = students.length;
        
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int count = 0;
            
            for (int j = 0; j < N; j++) {
                if (j == i) count += Math.ceil(Math.max(0, students[j] - Y) / (double) J);
                else        count += Math.ceil(students[j] / (double) J);
            }
            
            res = Math.min(res, count);
        }
        
        return res;
    }

}