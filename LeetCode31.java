public class LeetCode31 {

    class Solution {
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int i = n - 2;

            // 1. Find first index i from right where nums[i] < nums[i + 1]
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }

            if (i >= 0) {
                // 2. Find index j from right where nums[j] > nums[i]
                int j = n - 1;
                while (j >= 0 && nums[j] <= nums[i]) {
                    j--;
                }
                // 3. Swap nums[i], nums[j]
                swap(nums, i, j);
            }

            // 4. Reverse suffix nums[i + 1 ... n - 1]
            reverse(nums, i + 1, n - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
