package l9_12_cho;
import java.util.*;
class Node {
    int data;   // Value of the node
    int priority;   // Priority of the node
    Node next;  // Pointer to the next node

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

class PriorityQueue {
    Node head;  // Head of the linked list

    // Insert a new node into the priority queue
    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);

        // If the queue is empty or the new node has higher priority than the head
        if (head == null || head.priority > priority) {
            newNode.next = head;
            head = newNode;
        } else {
            // Traverse the list and find the correct position to insert
            Node temp = head;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Remove the element with the highest priority (head of the list)
    public void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Removed element: " + head.data);
            head = head.next;  // Move head to the next element
        }
    }

    // Peek the element with the highest priority (head of the list)
    public int peek() {
        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Display the priority queue
    public void display() {
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("[" + temp.data + ", Priority: " + temp.priority + "] -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        
        pq.enqueue(10, 3);  // Enqueue (10, Priority 3)
        pq.enqueue(20, 2);  // Enqueue (20, Priority 2)
        pq.enqueue(15, 1);  // Enqueue (15, Priority 1)
        pq.enqueue(30, 2);  // Enqueue (30, Priority 2)

        System.out.println("Priority Queue:");
        pq.display();  // Display the queue

        System.out.println("Peek element: " + pq.peek());  // Peek the highest priority element

        pq.dequeue();  // Remove the highest priority element
        pq.display();  // Display the queue after dequeue
    }
}
