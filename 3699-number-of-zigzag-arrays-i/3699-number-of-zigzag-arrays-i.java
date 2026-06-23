class Solution {

    public int zigZagArrays(int n, int l, int r) {

        int MOD = 1_000_000_007;
        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // Arrays of length 2
        for (int i = 0; i < m; i++) {

            up[i] = i;             // previous element smaller
            down[i] = m - 1 - i;   // previous element larger
        }

        for (int len = 3; len <= n; len++) {

            long[] prefixUp = new long[m + 1];
            long[] prefixDown = new long[m + 1];

            for (int i = 0; i < m; i++) {
                prefixUp[i + 1] = (prefixUp[i] + up[i]) % MOD;
                prefixDown[i + 1] = (prefixDown[i] + down[i]) % MOD;
            }

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            for (int i = 0; i < m; i++) {

                // To end with an increase, previous value must be smaller
                newUp[i] = prefixDown[i];

                // To end with a decrease, previous value must be larger
                newDown[i] = (prefixUp[m] - prefixUp[i + 1] + MOD) % MOD;
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;

        if (n == 2) {
            ans = 1L * m * (m - 1);
        } else {
            for (int i = 0; i < m; i++) {
                ans = (ans + up[i] + down[i]) % MOD;
            }
        }

        return (int) ans;
    }
}