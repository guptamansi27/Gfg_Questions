// User function Template for Java
class Solution {
    static int[] gcd(int a, int b) {
        if (b == 0) {
            return new int[]{a, 1, 0};
        }

        int[] res = gcd(b, a % b);

        int gcd = res[0];
        int x1 = res[1];
        int y1 = res[2];

        int x = y1;
        int y = x1 - (a / b) * y1;

        return new int[]{gcd, x, y};
    }
}