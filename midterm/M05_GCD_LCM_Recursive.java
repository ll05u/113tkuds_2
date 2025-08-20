import java.util.*;

public class M05_GCD_LCM_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        long g = gcd(a, b);
        long l = (a / g) * b;

        System.out.println("GCD: " + g);
        System.out.println("LCM: " + l);
    }

    static long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }
}

/*
 * Time Complexity: O(log min(a, b))
 * 說明：
 * 1. 遞迴歐幾里得演算法每次取餘數，數字快速縮小。
 * 2. 最差情況出現在連續費波那契數，遞迴深度仍為 O(log min(a, b))。
 *
 * Space Complexity: O(log min(a, b))
 * 說明：遞迴呼叫堆疊深度等同演算法步數，最差 O(log min(a, b))。
 */
