class Solution {

    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;

        if (n == 1) return m;

        int size = 2 * m;

        long[][] trans = new long[size][size];

        // up[v] <- sum(down[x]) where x < v
        for (int v = 0; v < m; v++) {
            for (int x = 0; x < v; x++) {
                trans[v][m + x] = 1;
            }
        }

        // down[v] <- sum(up[x]) where x > v
        for (int v = 0; v < m; v++) {
            for (int x = v + 1; x < m; x++) {
                trans[m + v][x] = 1;
            }
        }

        long[] base = new long[size];

        // Length = 2
        for (int v = 0; v < m; v++) {
            base[v] = v;              // up[v]
            base[m + v] = m - 1 - v; // down[v]
        }

        long[][] power = matrixPower(trans, n - 2);

        long[] finalState = multiply(power, base);

        long ans = 0;

        for (long val : finalState) {
            ans = (ans + val) % MOD;
        }

        return (int) ans;
    }

    private long[][] matrixPower(long[][] mat, long exp) {

        int n = mat.length;

        long[][] result = new long[n][n];

        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {

            if ((exp & 1) == 1) {
                result = multiply(result, mat);
            }

            mat = multiply(mat, mat);

            exp >>= 1;
        }

        return result;
    }

    private long[][] multiply(long[][] A, long[][] B) {

        int n = A.length;

        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {

                if (A[i][k] == 0) continue;

                for (int j = 0; j < n; j++) {

                    if (B[k][j] == 0) continue;

                    C[i][j] =
                            (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }

    private long[] multiply(long[][] A, long[] vec) {

        int n = A.length;

        long[] res = new long[n];

        for (int i = 0; i < n; i++) {

            long sum = 0;

            for (int j = 0; j < n; j++) {
                sum = (sum + A[i][j] * vec[j]) % MOD;
            }

            res[i] = sum;
        }

        return res;
    }
}