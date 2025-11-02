import java.util.PriorityQueue;

public class TaskScheduling {
    public static void main(String[] args) {
        // Task durations (can represent time or cost)
        int[] tasks = {4, 3, 2, 6};

        // Min-heap to always pick shortest tasks first
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int task : tasks) {
            pq.add(task);
        }

        int totalTime = 0;

        // Merge tasks until only one remains
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int combined = first + second;
            totalTime += combined;

            pq.add(combined);
        }

        System.out.println("Minimum Total Time = " + totalTime);
    }
}
