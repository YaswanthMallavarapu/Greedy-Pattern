class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int wt = 0;
        int sum = bt[0];
        for (int i = 1; i < bt.length; i++) {
            wt += sum;
            sum += bt[i];
        }
        return (wt / bt.length);
    }
}
