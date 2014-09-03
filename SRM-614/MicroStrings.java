public class MicroStrings {

    public String makeMicroString(int A, int D) {
        int element = A;
        String res = "";
        while (element >= 0) {
            res = res + Integer.toString(element);
            element -= D;
        }
        return res;
    }

}
