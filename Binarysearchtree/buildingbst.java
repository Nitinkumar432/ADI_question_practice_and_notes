package Binarysearchtree;
import java.util.*;

public class buildingbst {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            left=null;
           right=null;
        }
    }
    public static node insert(node root,int val){
        if(root==null){
            root=new node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(node root ,int vall){
        if(root==null){
            return false;

        }
        if(root.data==vall){
            return true;

        }
        if(root.data>vall){
            return search(root.left,vall);
        }else{
            return search(root.right,vall);

        }
    }
    public static void main(String[] args) {
        node root=null;
        int arr[]={5,1,3,4,2,7};
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);

        }
        System.out.println(search(root,77));
        inorder(root);
        
    }
    
}
