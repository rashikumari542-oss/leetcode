class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numList = new HashSet<>();
        for(Integer a: nums){

        numList.add(a);
        }

        if (numList.size() == nums.length) {
            return false;
        }

        else {
            return true;
        }

    }
}