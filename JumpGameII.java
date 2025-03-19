class Solution {
    public int getJumps(int nums[], int index, int steps) {
        if (index == nums.length - 1)
            return steps;
        else if (index >= nums.length)
            return Integer.MAX_VALUE;
        else {
            int minSteps = Integer.MAX_VALUE;
            int maxSteps = nums[index];
            for (int i = 1; i <= maxSteps; i++) {
                minSteps = Math.min(minSteps, getJumps(nums, index + i, steps + 1));
            }
            return minSteps;
        }
    }

    public int jump(int[] nums) {
        // return getJumps(nums,0,0);
        int minSteps[] = new int[nums.length];
        int n = nums.length;
        Arrays.fill(minSteps, Integer.MAX_VALUE);
        minSteps[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if ((i + j) < n)
                    minSteps[i + j] = Math.min(minSteps[i] + 1, minSteps[i + j]);
            }
        }
        return minSteps[n - 1];
    }
}