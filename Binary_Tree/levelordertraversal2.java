package Binary_Tree;
import java.util.*;
public class levelordertraversal2 {
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
    public static int height(node root){
        if(root==null){
            return 0;

        }
        int l=height(root.left);
        int r=height(root.right);
        int maxv=l>r ? l : r;
        return maxv+1;
    }
    public static void levelord(int st,int target,ArrayList<Integer>ar,node root){
        if(root==null){
            return;
        }
        if(st==target){
            ar.add(root.val);
        }
        levelord(st+1,target,ar,root.left);
        levelord(st+1,target,ar,root.right);
        


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        build_tree tree=new build_tree();
        node root= tree.createtree(arr);
       int height=height(root);
       for(int i=1;i<=height;i++){
        ArrayList<Integer>ar=new ArrayList<>();
        levelord(1,i,ar,root);
        System.out.println(" level : "+ i);
        for(int j : ar){
            System.out.print(j+" ");

        }
        System.out.println();


        
       }

    }
    
}
