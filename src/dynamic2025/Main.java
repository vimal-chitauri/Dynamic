package dynamic2025;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> findDivisors(int n) {
        // Initialize an empty
        // ArrayList to store the divisors
        ArrayList<Integer> divisors = new ArrayList<>();

        // Iterate up to the square
        // root of n to find divisors
        // Calculate the square root of n
        int sqrtN = (int) Math.sqrt(n);

        // Loop from 1 to the
        // square root of n
        for (int i = 1; i <= sqrtN; ++i) {
            // Check if i divides n
            // without leaving a remainder
            if (n % i == 0) {
                // Add divisor i to the list
                divisors.add(i);

                // Add the counterpart divisor
                // if it's different from i
                if (i != n / i) {
                    // Add the counterpart
                    // divisor to the list
                    divisors.add(n / i);
                }
            }
        }

        // Return the list of divisors
        return divisors;
    }

    public static void main(String[] args) {
        String str =  "ABCDCBA";
        recurssrionAdd(str);
    }

    private static void recurssrionAdd(String str) {

    }
}

