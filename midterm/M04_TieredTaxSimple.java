import java.util.*;

public class M04_TieredTaxSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] incomes = new int[n];
        for (int i = 0; i < n; i++) {
            incomes[i] = sc.nextInt();
        }
        sc.close();

        long totalTax = 0;
        for (int income : incomes) {
            long tax = computeTax(income);
            totalTax += tax;
            System.out.println("Tax: " + tax);
        }
        System.out.println("Average: " + (totalTax / n));
    }

    static long computeTax(int income) {
        long tax = 0;
        if (income > 1000000) {
            tax += (income - 1000000) * 30 / 100;
            income = 1000000;
        }
        if (income > 500000) {
            tax += (income - 500000) * 20 / 100;
            income = 500000;
        }
        if (income > 120000) {
            tax += (income - 120000) * 12 / 100;
            income = 120000;
        }
        tax += income * 5 / 100;
        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. 每筆收入在 computeTax 中檢查固定 4 個區間，屬於常數時間 O(1)。
 * 2. 共 n 筆收入，總計 O(n)。
 *
 * Space Complexity: O(n)
 * 說明：需存放 n 筆輸入的收入。若直接即時計算可降為 O(1)。
 */
