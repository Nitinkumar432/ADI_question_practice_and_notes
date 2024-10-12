package l9_12_cho;
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the heap
        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(3);
        minHeap.add(7);

        // The minimum element will always be at the head
        System.out.println("Min element: " + minHeap.peek()); // Outputs 3

        // Removing elements
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // Outputs elements in increasing order: 3, 5, 7, 10
        }
    }
}
