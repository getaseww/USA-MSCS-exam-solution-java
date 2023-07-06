/*
Write a function named countDigit that returns the number of times that a given digit appears in a
positive number. For example countDigit(32121, 1) would return 2 because there are two 1s in 32121.

The function should return -1 if either argument is negative, so
countDigit(-543, 3) returns -1.
 */

public class countDigits {

    static int countDigit(int x, int y) {
        if (x < 0 || y < 0)
            return -1;
        int count = 0;
        while (x != 0) {
            if (x % 10 == y)
                count++;
            x = x / 10;
        }

        return count;
    }

    public static void main(String args[]) {
        System.out.println(countDigit(33333, -1));
    }
}
