package Binary_Tree;
import java.util.*;
public class lowestcommonancestor {
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
    static class build_tree{
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




    }
    public static node lca(node root,int p,int q){
        if(root==null || root.val==p || root.val==q){
            return root;
        }
        node x=lca(root.left,p,q);
        node y =lca(root.right,p,q);
        if(x==null){
            return y;
        }
        if(y==null){
            return x;
       }
       return root;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        build_tree tree=new build_tree();
        node root= tree.createtree(arr);
        int p=4;
        int q=5;
        node x=lca(root,p,q);
        System.out.println(x.val);
    }

    
}
