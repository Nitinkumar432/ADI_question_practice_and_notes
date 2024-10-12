package l9_12_cho;

import java.util.*;

// priority_queue
// by deafult min heap implementation in java
public class priorityqueue {
    public static void main(String[] args) {
        // min heap in java
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        // max heap in java
        PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());

        pq.add(15);
        maxheap.add(15);
        pq.add(20);
        maxheap.add(20);
        pq.add(45);
        maxheap.add(45);
        pq.add(3);
        maxheap.add(3);
        pq.add(56);
        maxheap.add(56);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


        
    }
    
}
