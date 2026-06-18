class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int a = ((l + r) / 2);
            if (nums[a] == target) {
                return a;
            } else if (nums[a] < target) {
                l = a + 1;
            } else {
                r = a - 1;
            }

        }
        return -1;
    }
}