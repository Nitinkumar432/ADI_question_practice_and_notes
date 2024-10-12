package problems;


public class lca {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node buildTree(int[] arr, int idx) {
        if (idx >= arr.length || arr[idx] == -1) {
            return null; 
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = buildTree(arr, 2 * idx + 1);
        newNode.right = buildTree(arr, 2 * idx + 2);

        return newNode;
    }

    public static Node LCA(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        Node leftLCA = LCA(root.left, p, q);
        Node rightLCA = LCA(root.right, p, q);

        if (leftLCA == null) {
            return rightLCA;
        } else if (rightLCA == null) {
            return leftLCA;
        } else {
            return root; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,9,6,7};
        if (arr.length == 0) {
            System.out.println("Error: Input array is empty!");
            return;
        }

        Node root = buildTree(arr, 0);
        Node p = new Node(4);
        Node q = new Node(7);
        Node lcaNode = LCA(root, p, q);
        System.out.println("LCA of " + p.data + " and " + q.data + " is " + lcaNode.data);
    }
}