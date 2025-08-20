
import java.util.*;

public class M02_YouBikeNextArrival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = parseTime(sc.nextLine());
        }
        int query = parseTime(sc.nextLine());
        sc.close();

        int idx = upperBound(times, query);
        if (idx == n) {
            System.out.println("No bike");
        } else {
            System.out.println(formatTime(times[idx]));
        }
    }

    static int parseTime(String s) {
        String[] parts = s.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    static String formatTime(int t) {
        int h = t / 60;
        int m = t % 60;
        return String.format("%02d:%02d", h, m);
    }

    static int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
