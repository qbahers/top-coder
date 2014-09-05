import java.util.*;

public class GoodCompanyDivTwo {

    public int countGood(int[] superior, int[] workType) {
        int N = workType.length;

        Map<Integer, List<Integer>> department = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < N; i++) {
            List<Integer> l = new ArrayList<Integer>();
            l.add(i);
            department.put(i, l);
        }

        for (int i = 1; i < N; i++) {
            List<Integer> l = department.get(superior[i]);
            l.add(i);
            department.put(superior[i], l);
        }

        int res = 0;
        for (int i = 0; i < N; i++) {
            if (isDiverse(department.get(i), workType)) res++;
        }
        return res;
    }

    private static boolean isDiverse(List<Integer> dep, int[] workType) {
        int[] a = new int[101];

        for (Integer employee : dep) {
            if (a[workType[employee]] == 1) return false;
            a[workType[employee]] = 1;
        }
        return true;
    }

}
