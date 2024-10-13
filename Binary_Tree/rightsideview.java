package Binary_Tree;
import java.util.*;
public class rightsideview {
    public static class node{
        int val;
        node left;
        node right;
        node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public  static class buildtree{
       static  int ind=-1;
        public static node  createtree(int[] arr){
            ind++;
            if(arr[ind]==-1){
                return null;
            }
            node newnode=new node(arr[ind]);
            newnode.left=createtree(arr);
            newnode.right=createtree(arr);
            return newnode;


        }
        
    }
    public static  void rightview(node root,ArrayList<Integer>ar){
        if(root==null){
            return;

        }
        Queue<node>qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int n=qu.size();
          
          
            for(int i=0;i<n;i++){
                node  curr=qu.poll();
                if(i==n-1){
                    ar.add(curr.val);
                }
                if(curr.left!=null){
                    qu.add(curr.left);
                }
                if(curr.right!=null){
                    qu.add(curr.right);
                }
            }


        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildtree tree=new buildtree();
        node root=tree.createtree(arr);
        
        ArrayList<Integer>ar=new ArrayList<>();
        rightview(root,ar);
        System.out.println(ar);
        
    }
    
}
