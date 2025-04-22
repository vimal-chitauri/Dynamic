package Recurssion;

class Atoi {

    public static void main(String[] args) {
        String str="42";
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String s) {
        s = s.trim(); // Remove leading spaces
        if (s.isEmpty()) return 0; // If empty after trimming, return 0

        char[] str = s.toCharArray();
        int i = 0, sign = 1;

        // Handling the sign
        if (str[i] == '-') {
            sign = -1;
            i++;
        } else if (str[i] == '+') {
            i++;
        }

        // Start recursive conversion
        return helper(str, i, sign, 0L);
    }

    private static int helper(char[] str, int i, int sign, long ans) {
        if (i == str.length || !isDigit(str[i])) return (int) ans * sign;

        ans = (ans * 10) + (str[i] - '0');

        // Overflow checks
        if (ans * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return helper(str, i + 1, sign, ans);
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}