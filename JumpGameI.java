class Solution {
    public static boolean isPossible(int nums[], int idx, boolean reached) {
        if (idx == nums.length - 1)
            return true;
        if (idx >= nums.length)
            return false;
        for (int i = 1; i <= nums[idx]; i++) {
            if (isPossible(nums, idx + i, false)) {
                return true;
            }
        }
        return false;
    }

    public boolean canJump(int[] nums) {
        // return isPossible(nums,0,false);
        int n = nums.length;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i <= maxIndex) {
                maxIndex = Math.max(maxIndex, i + nums[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}