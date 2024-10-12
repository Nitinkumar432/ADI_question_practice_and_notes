package Binary_Tree;
import java.util.*;
public class diameterofbinarytree {
    static class node{
        int val;
        node left;
        node right;
        node(int val){
            this.val=val;
            node left=null;
            node right=null;
        }
    }
    static class buildtree{
        static int ind=-1;
        public static node createtree(int arr[]){
            ind++;
            if(arr[ind]==-1){
                return null;
            }
            node newnode=new node(arr[ind]);
            newnode.left=createtree(arr);
            newnode.right=createtree(arr);
            return newnode;

            

        }
        public static void preorder(node root){
            if(root==null){
                return ;

            }
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
        

    }
    public static int height(node root){
        if(root==null){
            return 0;
        }
        int x=height(root.left);
        int y=height(root.right);
       int maxv=x>y ? x: y;
        return maxv+1;
    }
    public static int diameter(node root){
        if(root==null){
            return 0;
        }
        int ht=height(root.left)+height(root.right)+1;
        int l=diameter(root.left);
        int  r=diameter(root.right);
        return Math.max(ht, Math.max(l, r));

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildtree tree=new buildtree();
        node root=tree.createtree(arr);
        tree.preorder(root);
        int x=height(root);
        System.out.println("height is "+x);
        int diameter=diameter(root);
        System.out.println(diameter);

        

        
    }    
}
