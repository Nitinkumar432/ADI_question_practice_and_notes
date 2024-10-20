package Binary_Tree.practice2andimplementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class buildingtreewithoutone {
    static class node {
        int val;
        node left;
        node right;

        node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    static class buildtree {
        static node createtree() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter root node value (-1 for no node): ");
            int data = sc.nextInt();
            if (data == -1) {
                return null; // No tree to create
            }
            node root = new node(data);
            Queue<node> qu = new LinkedList<>();
            qu.add(root);

            while (!qu.isEmpty()) {
                node curr = qu.poll();
                
                System.out.print("Enter left child of " + curr.val + " (-1 for no child): ");
                int leftdata = sc.nextInt();
                if (leftdata != -1) {
                    curr.left = new node(leftdata);
                    qu.add(curr.left);
                }

                System.out.print("Enter right child of " + curr.val + " (-1 for no child): ");
                int rightdata = sc.nextInt();
                if (rightdata != -1) {
                    curr.right = new node(rightdata);
                    qu.add(curr.right);
                }
            }
            return root;
        }

        static int heightofbt(node root) {
            if (root == null) {
                return 0;
            }
            int x = heightofbt(root.left);
            int y = heightofbt(root.right);
            return Math.max(x, y) + 1;
        }
    }

    public static void main(String[] args) {
        buildtree bt = new buildtree();
        node root = bt.createtree();
        System.out.println("Height of the binary tree: " + bt.heightofbt(root));
    }
}
