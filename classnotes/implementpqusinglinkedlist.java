package classnotes;
import java.util.*;

class Node {
    int data;
    int priority;
    Node next;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }

    static Node push(Node head, int d, int p) {
        Node start = head;
        Node temp = new Node(d, p);
        
        if (head == null || head.priority > p) {
            temp.next = head;
            head = temp;
        } else {
            while (start.next != null && start.next.priority < p) {
                start = start.next;
            }
            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }

    static Node pop(Node head) {
        if (head == null) {
            System.out.println("Priority queue is empty, cannot pop.");
            return null;
        }
        System.out.println("Popped node: " + head.data + " with priority " + head.priority);
        return head.next;
    }

    static void peek(Node head) {
        if (head == null) {
            System.out.println("Priority queue is empty.");
        } else {
            System.out.println("Peek: " + head.data + " with priority " + head.priority);
        }
    }

    static boolean isEmpty(Node head) {
        return head == null;
    }

    static void printQueue(Node head) {
        if (head == null) {
            System.out.println("Priority queue is empty.");
        } else {
            Node temp = head;
            System.out.println("Priority Queue:");
            while (temp != null) {
                System.out.println("Data: " + temp.data + ", Priority: " + temp.priority);
                temp = temp.next;
            }
        }
    }
}

public class implementpqusinglinkedlist {
    public static void main(String[] args) {
        Node pq = null;

        pq = Node.push(pq, 1, 5);
        pq = Node.push(pq, 2, 4);
        pq = Node.push(pq, 3, 3);
        pq = Node.push(pq, 4, 2);
        pq = Node.push(pq, 5, 1);

       
        Node.printQueue(pq);

        Node.peek(pq);
        pq = Node.pop(pq);
        Node.peek(pq);
        System.out.println("Is priority queue empty? " + Node.isEmpty(pq));

        pq = Node.pop(pq);
        pq = Node.pop(pq);
        pq = Node.pop(pq);
        pq = Node.pop(pq);

        System.out.println("Is priority queue empty? " + Node.isEmpty(pq));
    }
}
