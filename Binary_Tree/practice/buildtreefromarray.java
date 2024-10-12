package Binary_Tree.practice;
import java.util.*;
public class buildtreefromarray {
    static class node{
        int val;
        node left;
        node right;
        node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static class build_tree{
        public static node  createtree(int arr[],int st){
            if(arr[st]==-1){
                return null;
            }
            node new_node =new node(arr[st]);
            new_node.left=createtree(arr,st+1);
            new_node.right=createtree(arr,st+1);
            return new_node;


        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       build_tree tree=new build_tree();
       node root=tree.createtree(arr,0);
       System.out.println(root.val);
      


    }
    
}
