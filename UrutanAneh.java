import java.util.*;

public class UrutanAneh {

    // Time complexity: O(n log n)
    // Space complexity: O(n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Queue<Integer> minHeap = new PriorityQueue<>(size, Comparator.comparing(a -> new StringBuilder(Integer.toString(a)).reverse().toString()));

        for (int i = 0; i < size; i++) {
            minHeap.add(scanner.nextInt());
        }

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}