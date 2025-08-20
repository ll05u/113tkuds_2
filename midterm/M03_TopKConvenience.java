import java.util.*;

public class M03_TopKConvenience {
    static class Item {
        String name;
        int qty;
        Item(String name, int qty) {
            this.name = name;
            this.qty = qty;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int qty = sc.nextInt();
            items.add(new Item(name, qty));
        }
        sc.close();

        PriorityQueue<Item> minHeap = new PriorityQueue<>(
            (a, b) -> a.qty != b.qty ? a.qty - b.qty : a.name.compareTo(b.name)
        );

        for (Item it : items) {
            if (minHeap.size() < K) {
                minHeap.offer(it);
            } else if (it.qty > minHeap.peek().qty ||
                       (it.qty == minHeap.peek().qty && it.name.compareTo(minHeap.peek().name) < 0)) {
                minHeap.poll();
                minHeap.offer(it);
            }
        }

        List<Item> result = new ArrayList<>(minHeap);
        result.sort((a, b) -> b.qty != a.qty ? b.qty - a.qty : a.name.compareTo(b.name));

        for (Item it : result) {
            System.out.println(it.name + " " + it.qty);
        }
    }
}

/*
 * Time Complexity: O(n log K)
 * 說明：
 * 1. 每筆資料最多進出 heap 一次，heap 大小為 K，因此插入/刪除為 O(log K)。
 * 2. n 筆資料總計 O(n log K)，K 遠小於 n 時效率佳。
 * 3. 最後輸出排序 K 筆資料，成本 O(K log K)，可忽略於 n 大時。
 *
 * Space Complexity: O(K)
 * 說明：維護大小為 K 的 heap 與輸出結果。
 */
