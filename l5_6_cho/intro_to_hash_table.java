package l5_6_cho;
import java.util.*;
// linear probing
class HashTableLinearProbing {
    private int[] table;
    private int size;
    
    public HashTableLinearProbing(int size) {
        this.size = size;
        table = new int[size];
        
        Arrays.fill(table, -1);
    }
    
    
    private int hash(int key) {
        return key % size;
    }
    
    
    public void insert(int key) {
        int index = hash(key);
        int i = 0;
      
        while (table[(index + i) % size] != -1) {
            i++;
        }
        table[(index + i) % size] = key;
    }
    
    
    public boolean search(int key) {
        int index = hash(key);
        int i = 0;
    
        while (table[(index + i) % size] != key && table[(index + i) % size] != -1) {
            i++;
            if (i == size) {
                return false;  
            }
        }
        return table[(index + i) % size] == key;
    }
    
    // Display hash table
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        HashTableLinearProbing ht = new HashTableLinearProbing(10);
        ht.insert(12);
        ht.insert(22);
        ht.insert(32);  
        ht.insert(42);  
        
        ht.display(); 
        
        // Search for keys
        System.out.println("Search for 22: " + ht.search(22));
        System.out.println("Search for 43: " + ht.search(43));  // Not in the table
    }
}
