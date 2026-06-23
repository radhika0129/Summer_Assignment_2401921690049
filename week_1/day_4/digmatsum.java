class digmatsum {
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += mat[i][i];

            // Secondary diagonal
            sum += mat[i][n - i - 1];
        }

        // If matrix size is odd, subtract middle element once
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}