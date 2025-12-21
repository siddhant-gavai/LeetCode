public class LeetCode955 {

    public static int minDeletionSize(String[] strs) {
        int rows = strs.length; // number of rows
        int cols = strs[0].length(); // number of columns

        int deletion = 0;
        boolean[] alreadySorted = new boolean[rows];

        for (int col = 0; col < cols; col++) {
            boolean deleted = false;

            // check if this column breaks lexicographical order
            for (int row = 0; row < rows - 1; row++) {
                if (!alreadySorted[row] &&
                        strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    deletion++;
                    deleted = true;
                    break;
                }
            }

            if (deleted) {
                continue;
            }

            // update alreadySorted status
            for (int i = 0; i < rows - 1; i++) {
                alreadySorted[i] = alreadySorted[i] ||
                        (strs[i].charAt(col) < strs[i + 1].charAt(col));
            }
        }

        return deletion;
    }

    // main method for VS Code testing
    public static void main(String[] args) {
        String[] strs1 = { "ca", "bb", "ac" };
        System.out.println(minDeletionSize(strs1)); // Output: 1

        String[] strs2 = { "xc", "yb", "za" };
        System.out.println(minDeletionSize(strs2)); // Output: 0

        String[] strs3 = { "zyx", "wvu", "tsr" };
        System.out.println(minDeletionSize(strs3)); // Output: 3
    }
}
