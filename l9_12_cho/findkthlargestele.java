package l9_12_cho;

import java.util.PriorityQueue;
import java.util.Scanner;

public class findkthlargestele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements: ");
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-heap

        // Read n elements
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Enter k to find the kth largest element: ");
        int k = sc.nextInt();

        // If k is greater than n, it's invalid input
        if (k > n) {
            System.out.println("Invalid input: k cannot be greater than the number of elements.");
            return;
        }

        // Remove n-k elements, so that kth largest remains at the root
        for (int i = 0; i < n - k; i++) {
            pq.poll();
        }

        // The kth largest element is now at the root of the priority queue
        System.out.println("The " + k + "th largest element is: " + pq.peek());
    }
}
