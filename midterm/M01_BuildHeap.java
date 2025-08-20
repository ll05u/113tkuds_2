<<<<<<< HEAD
import java.util.*;

public class M01_BuildHeap {
    static String type;
    static int n;
    static int[] heap;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        type = sc.next();
        n = sc.nextInt();
        heap = new int[n];
        for (int i = 0; i < n; i++) {
            heap[i] = sc.nextInt();
        }
        sc.close();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i, n);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + (i == n - 1 ? "" : " "));
        }
    }

    static void heapify(int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int target = i;

        if (type.equals("max")) {
            if (left < size && heap[left] > heap[target]) {
                target = left;
            }
            if (right < size && heap[right] > heap[target]) {
                target = right;
            }
        } else {
            if (left < size && heap[left] < heap[target]) {
                target = left;
            }
            if (right < size && heap[right] < heap[target]) {
                target = right;
            }
        }

        if (target != i) {
            int temp = heap[i];
            heap[i] = heap[target];
            heap[target] = temp;
            heapify(target, size);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. heapify 單次操作最差 O(log n)，但不是所有節點都會下沉到最底。
 * 2. 在高度較低的節點數量很多，但每個下沉成本很小；高度高的節點雖少，但每次下沉成本大。
 * 3. 綜合計算 Σ O(height) = O(n)，因此建堆整體時間複雜度為 O(n)。
 *
 * Space Complexity: O(1)
 * 說明：僅使用常數額外變數（遞迴深度 O(log n) 若用遞迴實作，但可視為 O(1)）。
 */
=======
import java.util.*;

public class M01_BuildHeap {
    static String type;
    static int n;
    static int[] heap;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        type = sc.next();
        n = sc.nextInt();
        heap = new int[n];
        for (int i = 0; i < n; i++) {
            heap[i] = sc.nextInt();
        }
        sc.close();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i, n);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + (i == n - 1 ? "" : " "));
        }
    }

    static void heapify(int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int target = i;

        if (type.equals("max")) {
            if (left < size && heap[left] > heap[target]) {
                target = left;
            }
            if (right < size && heap[right] > heap[target]) {
                target = right;
            }
        } else {
            if (left < size && heap[left] < heap[target]) {
                target = left;
            }
            if (right < size && heap[right] < heap[target]) {
                target = right;
            }
        }

        if (target != i) {
            int temp = heap[i];
            heap[i] = heap[target];
            heap[target] = temp;
            heapify(target, size);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. heapify 單次操作最差 O(log n)，但不是所有節點都會下沉到最底。
 * 2. 在高度較低的節點數量很多，但每個下沉成本很小；高度高的節點雖少，但每次下沉成本大。
 * 3. 綜合計算 Σ O(height) = O(n)，因此建堆整體時間複雜度為 O(n)。
 *
 * Space Complexity: O(1)
 * 說明：僅使用常數額外變數（遞迴深度 O(log n) 若用遞迴實作，但可視為 O(1)）。
 */
>>>>>>> 317a2eea264547f76be00bd38fd02a7a172da1c9
