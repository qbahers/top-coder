public class OneDimensionalRobotEasy {

    public int finalPosition(String commands, int A, int B) {
        int res = 0;

        for (char c : commands.toCharArray()) {
            if (c == 'R' && res != B)  res++;
            if (c == 'L' && res != -A) res--;
        }

        return res;
    }

}
