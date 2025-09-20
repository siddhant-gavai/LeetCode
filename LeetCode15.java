public class LeetCode15 {
    public static void threeSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            int newTarget = target - nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == newTarget) {
                    System.out.println("Triplet found: " + nums[i] + ", " + nums[left] + ", " + nums[right]);
                    left++;
                    right--;
                } else if (sum < newTarget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 4, 5, 9, 11, 14 };
        int target = 23;
        threeSum(nums, target);

    }
}
