package l9_12_cho;
import java.util.ArrayList;

class MinHeap {
    private ArrayList<Integer> heap;

    // Constructor
    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Insert an element into the heap
    public void insert(int element) {
        heap.add(element); // Add the element at the end
        int index = heap.size() - 1;
        heapifyUp(index);  // Reorganize the heap
    }

    // Remove and return the minimum element (root) from the heap
    public int removeMin() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty.");
        }

        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1)); // Move the last element to the root
        heap.remove(heap.size() - 1);           // Remove the last element
        heapifyDown(0);                         // Reorganize the heap
        return min;
    }

    // Peek at the minimum element without removing it
    public int peekMin() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty.");
        }
        return heap.get(0);  // Root of the heap is the minimum element
    }

    // Heapify up: fix the heap property from a node up to the root
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index) < heap.get(parentIndex)) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    // Heapify down: fix the heap property from a node down to its children
    private void heapifyDown(int index) {
        int leftChild, rightChild, smallestChild;

        while (index < heap.size()) {
            leftChild = 2 * index + 1;
            rightChild = 2 * index + 2;
            smallestChild = index;

            if (leftChild < heap.size() && heap.get(leftChild) < heap.get(smallestChild)) {
                smallestChild = leftChild;
            }

            if (rightChild < heap.size() && heap.get(rightChild) < heap.get(smallestChild)) {
                smallestChild = rightChild;
            }

            if (smallestChild != index) {
                swap(index, smallestChild);
                index = smallestChild;
            } else {
                break;
            }
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Print the heap (for debugging)
    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        System.out.println("Min Heap:");
        minHeap.printHeap();

        System.out.println("Min Element: " + minHeap.removeMin());
        minHeap.printHeap();
    }
}
