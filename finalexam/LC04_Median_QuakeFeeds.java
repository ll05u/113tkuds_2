import java.io.*;
import java.util.*;
public class LC04_MedianOfTwoSortedArrays_Quake {
// 讀入: n m，下一行 n 整數(遞增)，下一行 m 整數(遞增)；輸出: 中位數(double)
public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
int n = Integer.parseInt(st.nextToken());
int m = Integer.parseInt(st.nextToken());
int[] A = new int[n];
int[] B = new int[m];
st = new StringTokenizer(br.readLine());
for (int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());
st = new StringTokenizer(br.readLine());
for (int j = 0; j < m; j++) B[j] = Integer.parseInt(st.nextToken());
System.out.println(median(A, B));
}

static double median(int[] A, int[] B) {
if (A.length > B.length) return median(B, A);
int n = A.length, m = B.length;
int totalLeft = (n + m + 1) / 2; // 左側元素總數
int lo = 0, hi = n;
while (lo <= hi) {
int i = (lo + hi) >>> 1; // A 左側取 i 個
int j = totalLeft - i; // B 左側取 j 個
int Aleft = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
int Aright = (i == n) ? Integer.MAX_VALUE : A[i];
int Bleft = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
int Bright = (j == m) ? Integer.MAX_VALUE : B[j];
if (Aleft <= Bright && Bleft <= Aright) {
if (((n + m) & 1) == 1) return Math.max(Aleft, Bleft);
return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
} else if (Aleft > Bright) {
hi = i - 1;
} else {
lo = i + 1;
}
}
throw new IllegalArgumentException("Invalid input");
}
}
