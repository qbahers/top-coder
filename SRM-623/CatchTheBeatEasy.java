import java.util.*;
import static java.lang.Math.*;

public class CatchTheBeatEasy {

    private class Point implements Comparable<Point> {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point that) {
            return this.y < that.y ? -1 : this.y == that.y ? 0 : 1;
        }
    }

    public String ableToCatchAll(int[] x, int[] y) {
        Point[] points = new Point[x.length];

        for (int i = 0; i < x.length; i++) {
            points[i] = new Point(x[i], y[i]);
        }

        Arrays.sort(points);

        int elapsedTime = 0;
        int characterPosition = 0;
        for (int i = 0; i < x.length; i++) {
            if (abs(characterPosition - points[i].x) <= points[i].y - elapsedTime) {
                elapsedTime = points[i].y;
                characterPosition = points[i].x;
            }
            else {
                return "Not able to catch";
            }
        }
        return "Able to catch";
    }

}
