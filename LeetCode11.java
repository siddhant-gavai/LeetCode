public class LeetCode11 {
    // Brute-force approach to find the maximum area of water container
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        LeetCode11 solution = new LeetCode11();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(solution.maxArea(height)); // Output: 49
    }
}