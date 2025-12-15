public class LeetCode2110 {
    public static long getDescentPeriods(int[] prices) {
        long ans = 1;
        long len = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) {
                len++;
            } else {
                len = 1;
            }
            ans += len;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = { 3, 2, 1, 4 };
        System.out.println(getDescentPeriods(prices)); // Output: 7
    }
}
