import java.util.*;

public class ChooseTheBestOne {

    public int countNumber(int N) {
        List<Integer> employees = new ArrayList<Integer>();
        
        for (int i = 1; i <= N; i++)
            employees.add(i);
        
        int turn = 1;
        int current = 0;
        while (employees.size() != 1) {
            int index = (int) ((current + Math.pow(turn, 3) - 1) % employees.size());
            Integer eliminated = employees.get(index);
            employees.remove(eliminated);
            turn++;
            current = index % employees.size();
        }
        
        return employees.get(0);
    }

}