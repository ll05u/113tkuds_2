// M10
import java.util.*;

public class M10_RBPropertiesCheck {
    static class Node {
        int val;
        char color;
        Node left, right;
        Node(int v, char c) { val = v; color = c; }
    }

    static Node[] nodes;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            char c = sc.next().charAt(0);
            if (val != -1) nodes[i] = new Node(val, c);
        }
        sc.close();

        if (nodes[0] == null || nodes[0].color != 'B') {
            System.out.println("RootNotBlack");
            return;
        }

        if (hasRedRed(0)) return;

        if (!checkBlackHeight(0).valid) {
            System.out.println("BlackHeightMismatch");
            return;
        }

        System.out.println("RB Valid");
    }

    static boolean hasRedRed(int idx) {
        if (idx >= nodes.length || nodes[idx] == null) return false;
        Node cur = nodes[idx];
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (cur.color == 'R') {
            if (left < nodes.length && nodes[left] != null && nodes[left].color == 'R') {
                System.out.println("RedRedViolation at index " + left);
                return true;
            }
            if (right < nodes.length && nodes[right] != null && nodes[right].color == 'R') {
                System.out.println("RedRedViolation at index " + right);
                return true;
            }
        }
        return hasRedRed(left) || hasRedRed(right);
    }

    static class BHResult {
        boolean valid;
        int blackHeight;
        BHResult(boolean v, int h) { valid = v; blackHeight = h; }
    }

    static BHResult checkBlackHeight(int idx) {
        if (idx >= nodes.length || nodes[idx] == null) {
            return new BHResult(true, 1);
        }
        BHResult L = checkBlackHeight(2 * idx + 1);
        BHResult R = checkBlackHeight(2 * idx + 2);
        if (!L.valid || !R.valid || L.blackHeight != R.blackHeight) {
            return new BHResult(false, 0);
        }
        int bh = L.blackHeight + (nodes[idx].color == 'B' ? 1 : 0);
        return new BHResult(true, bh);
    }
}
