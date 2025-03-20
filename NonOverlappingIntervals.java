class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int last = Integer.MIN_VALUE;
        int nonoverlapping = 0;
        for (int[] interval : intervals) {
            if (last <= interval[0]) {
                nonoverlapping++;
                last = interval[1];
            }
        }
        return n - nonoverlapping;
    }
}