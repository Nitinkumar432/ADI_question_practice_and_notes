package Binary_Tree.testpad;

import java.util.LinkedList;
import java.util.Queue;

public class printoddleveldata {
    /* 
 *  class Node {
 *    int data;
 *    Node left; 
 *    Node right;
 *    public Node() {
 *      data = 0;
 *    }
 *    public Node(int d)  {
 *      data = d;
 *    }
 *  }
 *
 *  The above class defines a tree node.
 */
static void printLevelWise(Node root) {
  if(root==null){
    return;
  }
  Queue<Node>qu=new LinkedList<>();
  boolean isfirst=true;
  qu.add(root);
  int level=1;
  qu.add(null);
    while(!qu.isEmpty()){
      Node curr=qu.poll();
      
      if(curr==null){
        isfirst=true;
        if(level%2!=0){
           System.out.println();
        }
        level++;
       
        if(qu.isEmpty()){
          break;
        }else{
          qu.add(null);
        }
      }else{
        if(level%2!=0){
        if(!isfirst){
          System.out.print(" ");
        }
        isfirst=false;
        System.out.print(curr.data);
        }
        if(curr.left!=null){
          qu.add(curr.left);
        }if(curr.right!=null){
          qu.add(curr.right);
        }
     }
}
 
  
}
    
}
