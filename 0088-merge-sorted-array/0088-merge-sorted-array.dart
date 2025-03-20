// nums1의 채워지지 않은 요소부터 nums2 요소 채우기
// class Solution {
//   void merge(List<int> nums1, int m, List<int> nums2, int n) {
//     // nums1의 채워지지 않은 요소부터 시작
//     for (int i = m; i < m + n; i++) {
//       nums1[i] = nums2[i - m];
//     }
//     nums1.sort();
//   }
// }

class Solution {
    void merge(List<int> nums1, int m, List<int> nums2, int n) {
        int i = m - 1; // nums1의 마지막 유효 요소 인덱스
        int j = n - 1; // nums2의 마지막 요소 인덱스
        int k = m + n - 1; // nums1의 마지막 인덱스
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // nums1의 요소를 사용
            } else {
                nums1[k--] = nums2[j--]; // nums2의 요소를 사용
            }
        }
        
        // nums2에 남은 요소가 있는 경우 복사
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
