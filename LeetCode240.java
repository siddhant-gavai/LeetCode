public class LeetCode240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("the element is found at index : " + row + " , " + col);
                return true;

            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("target not found at any index ");
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 11, 14, 17 },
                { 13, 19, 20 },
                { 24, 28, 40 }
        };
        int target = 28;

        System.out.println(searchMatrix(matrix, target));
    }
}
