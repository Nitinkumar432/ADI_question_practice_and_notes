package Binary_Tree;
import java.util.*;
public class buildtreepreorder {
    static class node{
        node left;
        node right;
        int val;
        node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }

    }
    static class Binarytree{
        static int ind=-1;
        public static node buildTree(int node[]){
            ind++;
            if(node[ind]==-1){
                return null;
            }
            node newnode=new node(node[ind]);
            newnode.left=buildTree(node);
            newnode.right=buildTree(node);
            return newnode;



        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        node root=tree.buildTree(arr);
        System.out.println(root.val);
    }
    
}
