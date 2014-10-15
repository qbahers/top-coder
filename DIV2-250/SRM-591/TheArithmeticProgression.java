import java.util.*;

public class TheArithmeticProgression {

    public double minimumChange(int a, int b, int c) {
        return Math.abs(b - (a + c) / 2.0);
    }

}