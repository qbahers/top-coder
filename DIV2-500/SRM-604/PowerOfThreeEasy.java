import java.util.*;

public class PowerOfThreeEasy {

    private Set<Point> possiblePoints = new HashSet<Point>();

    public String ableToGet(int x, int y) {
        possiblePoints.add(new Point(0, 0));
        nextPossibleSteps(0, 0, x, y, 0);
        
        return (possiblePoints.contains(new Point(x, y))) ? "Possible" : "Impossible";
    }
    
    private void nextPossibleSteps(int x_k, int y_k, int x, int y, int k) {
        int xx = x_k + (int) Math.pow(3, k);
        int yy = y_k + (int) Math.pow(3, k);
        
        if (xx <= x) {
            possiblePoints.add(new Point(xx, y_k));
            nextPossibleSteps(xx, y_k, x, y, k + 1);
        }
        if (yy <= y) {
            possiblePoints.add(new Point(x_k, yy));
            nextPossibleSteps(x_k, yy, x, y, k + 1);
        }
    }
    
    public class Point {
        private final int x;
        private final int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public int hashCode() {
            return 31 * x + y;
        }
        
        public boolean equals(Object obj) {
            if (!(obj instanceof Point))
                return false;
            if (obj == this)
                return true;
                
            Point that = (Point) obj;
            return this.x == that.x && this.y == that.y;
        }
    }

}