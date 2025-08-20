<<<<<<< HEAD

import java.util.*;

public class M09_AVLValidate {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();

        Node root = buildTree(arr);

        if (!isBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            System.out.println("Invalid BST");
            return;
        }

        if (checkAVL(root) == -1) {
            System.out.println("Invalid AVL");
            return;
        }

        System.out.println("Valid");
    }

    static Node buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node cur = q.poll();
            if (i < arr.length && arr[i] != -1) {
                cur.left = new Node(arr[i]);
                q.offer(cur.left);
            }
            i++;
            if (i < arr.length && arr[i] != -1) {
                cur.right = new Node(arr[i]);
                q.offer(cur.right);
            }
            i++;
        }
        return root;
    }

    static boolean isBST(Node root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

    static int checkAVL(Node root) {
        if (root == null) return 0;
        int lh = checkAVL(root.left);
        if (lh == -1) return -1;
        int rh = checkAVL(root.right);
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. isBST 對每個節點檢查一次區間合法性 → O(n)。
 * 2. checkAVL 後序遍歷一次，每節點計算高度 → O(n)。
 * 3. 總合仍為 O(n)。
 *
 * Space Complexity: O(h)
 * 說明：遞迴深度等於樹高，最差 O(n)，平均 O(log n)。
 */
=======

import java.util.*;

public class M09_AVLValidate {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();

        Node root = buildTree(arr);

        if (!isBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            System.out.println("Invalid BST");
            return;
        }

        if (checkAVL(root) == -1) {
            System.out.println("Invalid AVL");
            return;
        }

        System.out.println("Valid");
    }

    static Node buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node cur = q.poll();
            if (i < arr.length && arr[i] != -1) {
                cur.left = new Node(arr[i]);
                q.offer(cur.left);
            }
            i++;
            if (i < arr.length && arr[i] != -1) {
                cur.right = new Node(arr[i]);
                q.offer(cur.right);
            }
            i++;
        }
        return root;
    }

    static boolean isBST(Node root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

    static int checkAVL(Node root) {
        if (root == null) return 0;
        int lh = checkAVL(root.left);
        if (lh == -1) return -1;
        int rh = checkAVL(root.right);
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. isBST 對每個節點檢查一次區間合法性 → O(n)。
 * 2. checkAVL 後序遍歷一次，每節點計算高度 → O(n)。
 * 3. 總合仍為 O(n)。
 *
 * Space Complexity: O(h)
 * 說明：遞迴深度等於樹高，最差 O(n)，平均 O(log n)。
 */
>>>>>>> 491d3368344231aa28d3359cee305fd03d24e931
