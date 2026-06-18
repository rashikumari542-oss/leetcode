class Solution {
    public int findDuplicate(int[] nums) {
        int a[] = new int[nums.length];
        for (int b : a) {
            a[b] = 0;

        }
        for (int n : nums) {
            a[n]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 2) {
                return i;
            }
        }
        return 0;
    }
}