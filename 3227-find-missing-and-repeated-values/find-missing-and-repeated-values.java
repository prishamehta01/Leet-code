class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        long N = (long) n * n;

        long expectedSum =
                N * (N + 1) / 2;

        long expectedSqSum =
                N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSqSum = 0;

        for (int[] row : grid) {
            for (int val : row) {
                actualSum += val;
                actualSqSum += (long) val * val;
            }
        }

        long D = actualSum - expectedSum;
        long E = actualSqSum - expectedSqSum;

        long sumXY = E / D;

        int repeat =
                (int) ((D + sumXY) / 2);

        int miss =
                (int) (sumXY - repeat);

        return new int[]{repeat, miss};
    }
}