public class FibonacciDiv2 {
    private static int[] fib = new int[100];

    public int find(int N) {
        int n = 0;
        while (fibonacci(n) <= 1000000) {
            n++;
        }

        int i = 0;
        while (N >= fib[i]) {
            i++;
        }

        return Math.min(N - fib[i-1], fib[i] - N);
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (fib[n] != 0) return fib[n];

        return fib[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }

}
