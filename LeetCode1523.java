public class LeetCode1523 {

    // Function to count odd numbers in range [low, high]
    public static int countOdds(int low, int high) {
        // Math formula
        return (high + 1) / 2 - (low / 2);
    }

    public static void main(String[] args) {

        int low = 3;
        int high = 7;

        int result = countOdds(low, high);

        System.out.println("Number of odd numbers = " + result);
        // Expected output: 3
    }
}
