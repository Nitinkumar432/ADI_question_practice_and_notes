package Binary_Tree;


import java.util.*;
public class levelordertraversal {
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
      static int ind=-1;
        public static node  createtree(int arr[]){
          ind++;
            if(arr[ind]==-1){
                return null;
            }
            node new_node =new node(arr[ind]);
            new_node.left=createtree(arr);
            new_node.right=createtree(arr);
            return new_node;


        }
public static void levelOrder(node root) {
   if(root==null){
    return ;
   }
    Queue<node>qu=new LinkedList<>();
    qu.add(root);
    qu.add(null);
    while(!qu.isEmpty()){
        node curr=qu.poll();
        if(curr==null){
            System.out.println();
            if(qu.isEmpty()){
                break;
            }else{
                qu.add(null);
            }
        }else{
            System.out.print(curr.val+" ");
            if(curr.left!=null){
                qu.add(curr.left);
            }if(curr.right!=null){
                qu.add(curr.right);
            }
        }
    }
}


    }
    public static void main(String[] args) {
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       build_tree tree=new build_tree();
       node root=tree.createtree(arr
       );
    
      
       tree.levelOrder(root);
     
    
      


    }
    
}
