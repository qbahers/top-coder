import java.util.*;

public class ConnectingCars {
    
    public long minimizeCost(int[] positions, int[] lengths) {
        int N = positions.length;

        Car[] cars = new Car[N];
        for (int i = 0; i < N; i++)
            cars[i] = new Car(positions[i], lengths[i]);
        
        Arrays.sort(cars);

        long res = Long.MAX_VALUE;
        for (int k = 0; k < N; k++) {
            long energy = 0;

            int i = k;
            int back = cars[i].position + cars[i].length;
            while (i < N - 1) {
                i++;
                energy += cars[i].position - back;
                back += cars[i].length;
            }

            int j = k;
            int front = cars[j].position;
            while (j > 0) {
                j--;
                energy += front - (cars[j].position + cars[j].length);
                front -= cars[j].length;
            }

            res = Math.min(res, energy);
        }

        return res;
    }

    class Car implements Comparable<Car> {
        int position;
        int length;

        public Car(int position, int length) {
            this.position = position;
            this.length = length;
        }

        @Override
        public int compareTo(Car that) {
            return this.position > that.position ? 1 : this.position == that.position ? 0 : -1;
        }
    }

}