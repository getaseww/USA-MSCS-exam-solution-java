public class primeProduct {

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static int isPrimeProduct(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                for (int j = i + 1; j < n; j++) {
                    if (n % j == 0 && isPrime(j)) {
                        if (i * j == n)
                            return 1;
                    }
                }
            }

        }
        return 0;

    }

    static public static void main(String args[]) {

    }
}
