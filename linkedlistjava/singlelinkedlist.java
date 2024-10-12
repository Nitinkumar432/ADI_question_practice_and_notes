package linkedlistjava;
import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;

    }

    
}

public class singlelinkedlist {
    public static void traverse(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }


    }
    public static void main(String[] args) {
    
        node n1= new node(10);
        node n2=new node(20);
        node n3=new node(30);

        node head=n1;
        n1.next=n2;
        n2.next=n3;
        traverse(head);

    }
    
}
