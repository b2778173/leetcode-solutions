class Pow {
    public static double myPow(double x, int n) {
        for (int i = 0; i < n; i++) {
            x *= x;
        }
        return x;
    }
}