class Solution {
    int removeElement(List<int> nums, int val) {
        int count = 0;
        List<int> result = [];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}