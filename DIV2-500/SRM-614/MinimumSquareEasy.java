import java.util.*;

public class MinimumSquareEasy {

    public long minArea(int[] x, int[] y) {
        long smallestArea = Long.MAX_VALUE;
        int N = x.length;
        
        List<Point> points = new ArrayList<Point>();
        for (int i = 0; i < N; i++)
            points.add(new Point(x[i], y[i]));
        
        List<Point> outermostPoints = new ArrayList<Point>();
        
        Collections.sort(points, new AbscissaComparator());
        outermostPoints.add(points.get(0));
        outermostPoints.add(points.get(1));
        outermostPoints.add(points.get(N - 1));
        outermostPoints.add(points.get(N - 2));
        
        Collections.sort(points, new OrdinateComparator());
        outermostPoints.add(points.get(0));
        outermostPoints.add(points.get(1));
        outermostPoints.add(points.get(N - 1));
        outermostPoints.add(points.get(N - 2));
        
        for(int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                List<Point> p = new ArrayList<Point>(points);
                p.remove(outermostPoints.get(i));
                p.remove(outermostPoints.get(j));
                smallestArea = Math.min(smallestArea, getArea(p));
            }
        }
        
        return smallestArea;
    }
    
    private long getArea(List<Point> p) {
        int S = p.size();
        
        Collections.sort(p, new AbscissaComparator());
        long width = p.get(S - 1).x - p.get(0).x + 2;
        Collections.sort(p, new OrdinateComparator());
        long height = p.get(S - 1).y - p.get(0).y + 2;
        
        long side = Math.max(width, height);
        
        return side * side;
    }
    
    class Point {
        int x;
        int y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    class AbscissaComparator implements Comparator<Point> {
        @Override
        public int compare(Point a, Point b) {
            return a.x < b.x ? -1 : a.x == b.x ? 0 : 1;
        }
    }
    
    class OrdinateComparator implements Comparator<Point> {
        @Override
        public int compare(Point a, Point b) {
            return a.y < b.y ? -1 : a.y == b.y ? 0 : 1;
        }
    }

}