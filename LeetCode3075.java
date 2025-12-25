import java.util.PriorityQueue;
import java.util.Collections;

public class LeetCode3075 {

    // Method (same logic as LeetCode)
    public long maximumHappinessSum(int[] happiness, int k) {
        long result = 0;
        int count = 0;

        // Max-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int hap : happiness) {
            pq.offer(hap);
        }

        for (int i = 0; i < k; i++) {
            int hap = pq.poll();
            result += Math.max(hap - count, 0);
            count++;
        }

        return result;
    }

    // Main method for VS Code testing
    public static void main(String[] args) {
        LeetCode3075 sol = new LeetCode3075();

        int[] happiness = { 1, 2, 3 };
        int k = 2;

        System.out.println(sol.maximumHappinessSum(happiness, k));
    }
}
