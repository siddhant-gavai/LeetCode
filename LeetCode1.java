public class LeetCode1 {

    // optimized approach to find two sum
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[] {};
    }

    public static void main(String[] args) {
        LeetCode1 solution = new LeetCode1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]"); // Output: Indices: [0, 1]
    }
}