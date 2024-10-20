package Binary_Tree.practice2andimplementation;
import java.util.*;

import Binary_Tree.inorder;
class node{
    int data;
    node left,right;
    node(int val){
        this.data=val;
    }

    
}
public class buiildbinaryteeusingtree{
    public static node createbinarytree(String str){
        if(str==null || str.length()==0){
            return null;
        }
        node root=new node(Character.getNumericValue(str.charAt(0)));
        Queue<node>qu= new LinkedList<>();
        qu.add(root);
        int i=1;
        while(i<str.length() && !qu.isEmpty()){
            node curr=qu.poll();
            // left child assign
            if(i<str.length()){
                int leftv=Character.getNumericValue(str.charAt(i));
                curr.left=new node(leftv);
                qu.add(curr.left);
                i++;
            }
            // right child assign
            if(i<str.length()){
                int rightv=Character.getNumericValue(str.charAt(i));
                curr.right=new node(rightv);
                qu.add(curr.right);
                i++;

            }
        }
        return root;
    }
    public static void inOrderTraversal(node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        String str="123456789";
        node root =createbinarytree(str);
        inOrderTraversal(root);


    }

    
}
