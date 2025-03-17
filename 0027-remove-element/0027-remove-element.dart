class Solution {
    int removeElement(List<int> nums, int val) {
        int count = 0;
        // i는 순회 배열
        // count는 저장 위치 포인터
        for (int i = 0; i < nums.length; i++) {
            // val값과 맞지 않으면 저장 위치 포인터에 순회 배열 추가
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
