package l9_12_cho;
import java.util.*;
public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(5);
        maxheap.add(12);
        maxheap.add(45);
        maxheap.add(455);
        System.out.println("max ele "+ maxheap.peek());
        while(!maxheap.isEmpty()){
            System.out.println(maxheap.poll());
        }
    }
    
}
