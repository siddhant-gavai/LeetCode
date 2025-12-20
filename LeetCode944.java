public class LeetCode944 {

    public static int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int count = 0;

        for (int col = 0; col < m; col++) {
            for (int row = 1; row < n; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strs = { "cba", "daf", "ghi" };
        System.out.println(minDeletionSize(strs)); // Output: 1
    }

}
