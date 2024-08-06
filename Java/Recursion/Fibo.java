public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(5);
    }

    static int fibo(int n) {
        // base condition
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}